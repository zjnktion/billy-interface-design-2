package cn.zjnktion.billy.future;

import cn.zjnktion.billy.listener.BiFutureListener;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface WriteFuture extends BiFuture {

    boolean isWritten();

    void setWrittenAndNotifyAll();

    Throwable getThrowable();

    void setThrowableAndNotifyAll();

    WriteFuture addListener(BiFutureListener<?> listener);

    WriteFuture removeListener(BiFutureListener<?> listener);

    WriteFuture await() throws InterruptedException;

    WriteFuture awaitUninterruptibly();

}
