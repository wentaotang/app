package com.hgcode.weixin.share.response;

/**
 * 获取access_token 相应实体
 * Created by wentao on 16/8/14.
 */
public class AccessTokenResponse extends WeixinResponse{
    /**
     * access_token
     */
    private String access_token;
    /**
     * 有效时间 单位:秒
     */
    private Integer expires_in;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }
}
