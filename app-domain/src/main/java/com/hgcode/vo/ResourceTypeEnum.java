package com.hgcode.vo;

/**
 * Created by wentao on 16/1/31.
 */
public enum ResourceTypeEnum {

    MENU("menu"),BUTTON("button");

    private  String value;

    ResourceTypeEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }


}
