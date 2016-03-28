package cn.zjnktion.billy.future;

import cn.zjnktion.billy.context.BiContext;
import cn.zjnktion.billy.listener.BiFutureListener;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface BiFuture {

    /**
     * Adds the specified listener to this future.
     * The specified listener is notified after this future is {@linkplain #isCompleted() completed}.
     * If this future is already completed before added, the specified listener is notified immediately.
     *
     * @param listener The listener to add
     * @return the current {@link BiFuture}
     */
    BiFuture addListener(BiFutureListener<?> listener);

    /**
     * Removes the specified listener from this future.
     * The specified listener is no longer notified when this future is {@linkplain #isCompleted() completed}.
     * If the specified listener is not associated with this future, this method does nothing and returns silently.
     *
     * @param listener The listener to remove
     * @return the current {@link BiFuture}
     */
    BiFuture removeListener(BiFutureListener<?> listener);

    /**
     * Wait for this future to be completed.
     *
     * @return the current {@link BiFuture}
     * @throws InterruptedException If the current thread was interrupted
     */
    BiFuture await() throws InterruptedException;

    /**
     * Wait for this future to be completed within the specified time limit.
     *
     * @param timeout
     * @param unit
     * @return {@code true} if an only if the future was completed within the specified time limit
     * @throws InterruptedException If the current thread was interrupted
     */
    boolean await(long timeout, TimeUnit unit) throws InterruptedException;

    /**
     * Wait for this future to be completed without {@link InterruptedException}.
     * This method catches an {@link InterruptedException} and discards it silently.
     *
     * @return
     */
    BiFuture awaitUninterruptibly();

    /**
     * Wait for this future to be completed within the specified time limit without {@link InterruptedException}.
     * This method catches an {@link InterruptedException} and discards it silently.
     *
     * @param timeout
     * @param unit
     * @return {@code true} if and only if the future was completed within the specified time limit
     */
    boolean awaitUninterruptibly(long timeout, TimeUnit unit);

    /**
     * @return a {@link BiContext} where the I/O operation associated with this future takes place.
     */
    BiContext getContext();

    /**
     * @return {@code true} if this future is completed
     */
    boolean isCompleted();

}
