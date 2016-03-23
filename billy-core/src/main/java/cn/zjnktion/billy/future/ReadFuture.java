package cn.zjnktion.billy.future;

import cn.zjnktion.billy.listener.BiFutureListener;

/**
 * Created by zjnktion on 2016/3/23.
 */
public interface ReadFuture extends BiFuture {

    Object getMessage();

    boolean isRead();

    void setReadAndNotifyAll();

    boolean isClosed();

    void setClosedAndNotifyAll();

    Throwable getThrowable();

    void setThrowableAndNotifyAll();

    ReadFuture addListener(BiFutureListener<?> listener);

    ReadFuture removeListener(BiFutureListener<?> listener);

    ReadFuture await() throws InterruptedException;

    ReadFuture awaitUninterruptibly();

}
