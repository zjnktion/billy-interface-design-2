package cn.zjnktion.billy.future;

import cn.zjnktion.billy.context.BiContext;
import cn.zjnktion.billy.listener.BiFutureListener;

/**
 * Created by zhengjn on 2016/3/28.
 */
public interface ConnectFuture extends BiFuture {

    void setContext(BiContext context);

    boolean isConnected();

    boolean isCanceled();

    boolean cancle();

    Throwable getCause();

    void setCause();

    ConnectFuture addListener(BiFutureListener<?> listener);

    ConnectFuture removeListener(BiFutureListener<?> listener);

    ConnectFuture await() throws InterruptedException;

    ConnectFuture awaitUninterruptibly();

}
