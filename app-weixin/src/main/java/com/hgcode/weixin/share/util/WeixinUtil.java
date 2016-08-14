package com.hgcode.weixin.share.util;

import com.alibaba.fastjson.JSON;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.hgcode.weixin.share.response.AccessTokenResponse;
import com.hgcode.weixin.share.response.WebAccessTokenResponse;
import com.hgcode.weixin.share.response.WeiXinUserInfoResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by wentao on 16/8/14.
 */
public class WeixinUtil {

    private static final Logger log= LoggerFactory.getLogger(WeixinUtil.class);

    private static final String ACCESS_TOKEN="access_token";

    /**
     * 获取微信 access_token
     * @param appid
     * @return
     */
    private  static String getAccessToken(String appid) {


        Cache<String, String> cache = CacheBuilder.newBuilder().expireAfterWrite(7000, TimeUnit.SECONDS).build();
        try {
            String resultVal = cache.get(ACCESS_TOKEN, new Callable<String>() {
                public String call() {
                    String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=APPSECRET";
                    String result=buildResponse(url);
                    if(StringUtils.isBlank(result))
                        return null;
                    AccessTokenResponse accessTokenResponse=JSON.parseObject(buildResponse(result),AccessTokenResponse.class);
                    if(accessTokenResponse.getErrcode()!=null){
                        return accessTokenResponse.getAccess_token();
                    }
                    return "";
                }
            });
            return resultVal;
        } catch (ExecutionException e) {
            e.printStackTrace();
            return "";
        }
    }



    public static WebAccessTokenResponse getWebAccessToken(String appid, String secret, String code){
        String url ="https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appid+"&secret="+secret+"&code="+code+"&grant_type=authorization_code";
        String result=buildResponse(url);
        if(StringUtils.isBlank(result))
            return null;
        return (WebAccessTokenResponse) JSON.parse(buildResponse(result));
    }

    public static WebAccessTokenResponse refreshWebAccessToken(String appid,String refreshToken){
        String url="https://api.weixin.qq.com/sns/oauth2/refresh_token?appid="+appid+"&grant_type=refresh_token&refresh_token="+refreshToken;
        String result=buildResponse(url);
        if(StringUtils.isBlank(result))
            return null;
        return (WebAccessTokenResponse) JSON.parse(buildResponse(result));
    }

    public static WeiXinUserInfoResponse getUserInfo(String access_token, String openid) {
        String url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token + "&openid=" + openid + "&lang=zh_CN ";
        String result=buildResponse(url);
        if(StringUtils.isBlank(result))
            return null;
        return (WeiXinUserInfoResponse) JSON.parse(buildResponse(result));
    }

    private static  String buildResponse(String url){
        Request request = new Request.Builder().url(url).build();
        final OkHttpClient client = new OkHttpClient();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            log.error("okhttp处理异常{}",url, e);
            return "";
        }
    }

}
