package com.coolweather.app.util;

/**
 * Created by jiangyuwei on 16/3/21.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
