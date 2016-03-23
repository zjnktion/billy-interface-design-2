package cn.zjnktion.billy.listener;

import cn.zjnktion.billy.future.BiFuture;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface BiFutureListener<F extends BiFuture> extends BiListener {

    void onCompleted(F future);

}
