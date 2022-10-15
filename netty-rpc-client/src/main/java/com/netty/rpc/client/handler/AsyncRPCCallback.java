package com.netty.rpc.client.handler;

/**
 * Created by zhangmm on 2016-03-17.
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
