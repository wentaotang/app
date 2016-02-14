package com.hgcode;

/**
 * Created by wentao on 16/1/31.
 */
public enum SexEnum {

    MALE("1"),FEMAL("2");

    private  String value;
    private  String text;

    SexEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }


}
