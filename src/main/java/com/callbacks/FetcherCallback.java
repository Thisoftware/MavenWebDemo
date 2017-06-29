package com.callbacks;

/**
 * Created by Administrator on 2017-05-20.
 */
public interface FetcherCallback {
    void onData(Data data)throws Exception;
    void onError(Throwable cause);
}
