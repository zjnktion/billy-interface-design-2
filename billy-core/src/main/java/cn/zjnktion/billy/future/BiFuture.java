package cn.zjnktion.billy.future;

import cn.zjnktion.billy.context.BiContext;
import cn.zjnktion.billy.listener.BiFutureListener;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface BiFuture {

    BiFuture addListener(BiFutureListener<?> listener);

    BiFuture removeListener(BiFutureListener<?> listener);

    BiContext getContext();

    BiFuture await() throws InterruptedException;

    boolean await(long timeout, TimeUnit unit) throws InterruptedException;

    BiFuture awaitUninterruptibly();

    boolean awaitUninterruptibly(long timeout, TimeUnit unit);

    boolean isCompleted();

}
