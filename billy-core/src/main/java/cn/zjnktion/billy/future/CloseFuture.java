package cn.zjnktion.billy.future;

import cn.zjnktion.billy.listener.BiFutureListener;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface CloseFuture extends BiFuture {

    boolean isClosed();

    void setClosed();

    CloseFuture addListener(BiFutureListener<?> listener);

    CloseFuture removeListener(BiFutureListener<?> listener);

    CloseFuture await() throws InterruptedException;

    CloseFuture awaitUninterruptibly();

}
