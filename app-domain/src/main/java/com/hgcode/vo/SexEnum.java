package com.hgcode.vo;

/**
 * Created by wentao on 16/1/31.
 */
public enum SexEnum {
    /**
     * 男性
     */
    MALE("1"),
    /**
     * 女性
     */
    FEMAL("2");

    private  String value;
    private  String text;

    SexEnum(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

	public String getText() {
		return text;
	}
    
    


}
