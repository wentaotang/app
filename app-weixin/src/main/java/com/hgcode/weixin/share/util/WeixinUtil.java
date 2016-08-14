package com.hgcode.weixin.share.util;

import com.alibaba.fastjson.JSON;
import com.hgcode.weixin.share.response.AccessTokenResponse;
import com.hgcode.weixin.share.response.WebAccessTokenResponse;
import com.hgcode.weixin.share.response.WeiXinUserInfoResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by wentao on 16/8/14.
 */
public class WeixinUtil {

    private static final Logger log= LoggerFactory.getLogger(WeixinUtil.class);

    /**
     * 获取微信 access_token
     * @param appid
     * @return
     */
    public static AccessTokenResponse getAccessToken(String appid) {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=APPSECRET";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return (AccessTokenResponse) JSON.parse(response.body().string());
        } catch (IOException e) {
            log.error("获取微信access_token异常",e);
            return null;
        }
    }

    public static WebAccessTokenResponse getWebAccessToken(String appid, String secret, String code){
        String url ="https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appid+"&secret="+secret+"&code="+code+"&grant_type=authorization_code";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return (WebAccessTokenResponse) JSON.parse(response.body().string());
        } catch (IOException e) {
            log.error("获取web access_token异常",e);
            return null;
        }
    }

    public static WebAccessTokenResponse refreshWebAccessToken(String appid,String refreshToken){
        String url="https://api.weixin.qq.com/sns/oauth2/refresh_token?appid="+appid+"&grant_type=refresh_token&refresh_token="+refreshToken;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return (WebAccessTokenResponse) JSON.parse(response.body().string());
        } catch (IOException e) {
            log.error("refresh微信access_token异常",e);
            return null;
        }
    }

    public static WeiXinUserInfoResponse getUserInfo(String access_token, String openid){
        String url="https://api.weixin.qq.com/sns/userinfo?access_token="+access_token+"&openid="+openid+"&lang=zh_CN ";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return (WeiXinUserInfoResponse) JSON.parse(response.body().string());
        } catch (IOException e) {
            log.error("refresh微信access_token异常",e);
            return null;
        }
    }

}
