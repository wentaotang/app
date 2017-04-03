package com.hgcode.util;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by wentao on 2015/10/4.
 */
public class Java8Test {

    @Test
    public void Streamtest(){
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.stream().forEach(str -> System.out.println(str));
    }


    @Test
    public void whileTest(){
        int i=0;
        while(true){
            i++;
            if(i>=5){
                break;
            }
            System.out.println(i);
        }
    }
}
