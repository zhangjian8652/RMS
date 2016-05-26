package com.joker.common.http.domain;

import java.io.InputStream;
import java.util.Map;

/**
 * author:zhangjian
 * date:2016-04-11
 * describe:
 **/
public class Response {
    private Integer status;
    private String data;
    private InputStream inputStream;
    private Map<String,String> headers;
}
