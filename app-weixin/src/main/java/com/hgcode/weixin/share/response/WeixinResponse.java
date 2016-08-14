package com.hgcode.weixin.share.response;

/**
 * Created by wentao on 16/8/14.
 */
public abstract class WeixinResponse {
    /**
     * 错误编码
     */
    private Integer errcode;
    /**
     * 错误信息
     */
    private String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
