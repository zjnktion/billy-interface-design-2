package cn.zjnktion.billy.task;

import cn.zjnktion.billy.future.BiFuture;

/**
 * Design for designing, maybe i should remove this interface from billy.
 * Created by zhengjn on 2016/3/23.
 */
public interface BiTask {

    /**
     * @return the original task which is not filtered by any {@link cn.zjnktion.billy.filter.BiFilter}
     */
    BiTask getOriginalTask();

    /**
     * @return the future associate this task
     */
    BiFuture getFuture();

}
