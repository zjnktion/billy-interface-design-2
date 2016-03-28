package cn.zjnktion.billy.listener;

import cn.zjnktion.billy.future.BiFuture;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface BiFutureListener<F extends BiFuture> extends BiListener {

    /**
     * Invoked when the operation associated with the {@link BiFuture} has been completed.
     *
     * @param future  the source {@link BiFuture} which called this callback
     */
    void operationComplete(F future);

}
