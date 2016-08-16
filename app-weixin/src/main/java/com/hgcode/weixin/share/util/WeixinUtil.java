package com.hgcode.weixin.share.util;

import com.alibaba.fastjson.JSON;
import com.hgcode.weixin.share.response.AccessTokenResponse;
import com.hgcode.weixin.share.response.JsApiTicketResponse;
import com.hgcode.weixin.share.response.WebAccessTokenResponse;
import com.hgcode.weixin.share.response.WeiXinUserInfoResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by wentao on 16/8/14.
 */
public class WeixinUtil {
    /**
     * 获取access_token
     * @param appid
     * @return
     */
    private static AccessTokenResponse getAccessToken(String appid) throws IOException {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=APPSECRET";
        String result = buildResponse(url);
        return  JSON.parseObject(result,AccessTokenResponse.class);
    }


    public static WebAccessTokenResponse getWebAccessToken(String appid, String secret, String code) throws IOException {
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + appid + "&secret=" + secret + "&code=" + code + "&grant_type=authorization_code";
        String result = buildResponse(url);
        return  JSON.parseObject(result,WebAccessTokenResponse.class);
    }

    public static WebAccessTokenResponse refreshWebAccessToken(String appid, String refreshToken) throws IOException {
        String url = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + appid + "&grant_type=refresh_token&refresh_token=" + refreshToken;
        String result = buildResponse(url);
        return JSON.parseObject(result,WebAccessTokenResponse.class);
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

    public static JsApiTicketResponse getJsApiTicket(String access_token) throws IOException {
        String url="https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token="+access_token+"&type=jsapi";
        String result = buildResponse(url);
        return JSON.parseObject(result,JsApiTicketResponse.class);
    }

    public static String sign(Map<String,String> map){
        String params=createLinkString(map);
        return DigestUtils.sha1Hex(params);
    }
    /** 
     * Created with IDEA
     * Author: wentao_tang
     * Date: 2016/8/16 16:49
     * Description: 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     */
    private static String createLinkString(Map<String,String> params){
        List keys = new ArrayList(params.keySet());
        Collections.sort(keys);
        String result = "";
        for (int i = 0; i < keys.size(); i++) {
            String key = (String) keys.get(i);
            String value = params.get(key);
            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                result += key + "=" + value;
            } else {
                result += key + "=" + value + "&";
            }
        }
        return result;
    }

    private static String buildResponse(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
