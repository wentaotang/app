package com.hgcode.weixin.share.vo;

/**
 * Created by wentao on 16/8/14.
 */
public class WeixinShare {
    /**
     * 分享标题
     */
    private String title;
    /**
     * 分享链接
     */
    private String link;
    /**
     * 分享图标
     */
    private String imgUrl;
    /**
     * 分享描述
     */
    private String desc;
    /**
     * 分享类型,music、video或link，不填默认为link
     */
    private String type;
    /**
     * 如果type是music或video，则要提供数据链接，默认为空
     */
    private String dataUrl;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }
}
