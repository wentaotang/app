package com.hgcode.util.http;

import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import java.io.IOException;

/**
 * Created by wentao_tang on 2016/5/11.
 */
public class HttpUtils {

    public void sendhttp(String url) throws IOException {
        Content content=Request.Get(url).execute().returnContent();
    }
}
