package com.hgcode.fastjson;

import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * Created with IntelliJ IDEA.
 * User: wentao_tang
 * Date: 2016/8/18
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public class MyValueFilter implements ValueFilter {
    @Override
    public Object process(Object object, String name, Object value) {
        if(value instanceof String){
            String tmp=value.toString();
            return  tmp.replace("<script>","");
        }
        return value;
    }
}
