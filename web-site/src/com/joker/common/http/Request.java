package com.joker.common.http;

import com.joker.common.http.domain.Response;

/**
 * author:zhangjian
 * date:2016-04-11
 * describe:
 **/
public interface Request {
    Response get();
    Response post();
    Response put();
    Response delete();
}
