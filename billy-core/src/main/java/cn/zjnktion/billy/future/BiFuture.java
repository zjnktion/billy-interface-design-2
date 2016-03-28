package cn.zjnktion.billy.future;

import cn.zjnktion.billy.context.BiContext;
import cn.zjnktion.billy.listener.BiFutureListener;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface BiFuture {

    /**
     * Returns a {@link BiContext} where the I/O operation associated with this future task take place
     * @return
     */
    BiContext getContext();

    BiFuture addListener(BiFutureListener<?> listener);

    BiFuture removeListener(BiFutureListener<?> listener);

    BiFuture await() throws InterruptedException;

    boolean await(long timeout, TimeUnit unit) throws InterruptedException;

    BiFuture awaitUninterruptibly();

    boolean awaitUninterruptibly(long timeout, TimeUnit unit);

    boolean isCompleted();

}
