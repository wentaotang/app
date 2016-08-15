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

    private static final Logger log = LoggerFactory.getLogger(WeixinUtil.class);

    private static final String ACCESS_TOKEN = "access_token";

    /**
     * 获取微信 access_token
     *
     * @param appid
     * @return
     */
    private static AccessTokenResponse getAccessToken(String appid) throws IOException {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=APPSECRET";
        String result = buildResponse(url);
        return  JSON.parseObject(buildResponse(result),AccessTokenResponse.class);
    }


    public static WebAccessTokenResponse getWebAccessToken(String appid, String secret, String code) throws IOException {
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + appid + "&secret=" + secret + "&code=" + code + "&grant_type=authorization_code";
        String result = buildResponse(url);
        return  JSON.parseObject(buildResponse(result),WebAccessTokenResponse.class);
    }

    public static WebAccessTokenResponse refreshWebAccessToken(String appid, String refreshToken) throws IOException {
        String url = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + appid + "&grant_type=refresh_token&refresh_token=" + refreshToken;
        String result = buildResponse(url);
        return JSON.parseObject(buildResponse(result),WebAccessTokenResponse.class);
    }
    /**
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/8/15 17:09
     * Description: 获取微信用户信息的access_token 是从web授权界面获取的，和普通的access_token不同
     */
    public static WeiXinUserInfoResponse getUserInfo(String access_token, String openid) throws IOException {
        String url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token + "&openid=" + openid + "&lang=zh_CN ";
        String result = buildResponse(url);
        return JSON.parseObject(buildResponse(result),WeiXinUserInfoResponse.class);
    }

    private static String buildResponse(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
