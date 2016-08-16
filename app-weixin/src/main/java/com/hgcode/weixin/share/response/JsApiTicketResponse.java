package com.hgcode.weixin.share.response;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/8/16
 * Time: 13:58
 * To change this template use File | Settings | File Templates.
 */
public class JsApiTicketResponse extends BaseResponse {
    /**
     * ticket
     */
    private String ticket;
    /**
     * 过期时间
     */
    private Integer expires_in;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }
}
