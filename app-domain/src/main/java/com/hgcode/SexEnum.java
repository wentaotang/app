package com.hgcode;

/**
 * Created by wentao on 16/1/31.
 */
public enum SexEnum {

    MALE("1","男"),FEMAL("2","女");

    private  String value;
    private  String text;

    private SexEnum(){}

    SexEnum( String value , String text){
        this.text=text;
        this.value=value;
    }

    public String getValue(){
        return value;
    }

    public String getText(){
        return text;
    }


}
