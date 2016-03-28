package cn.zjnktion.billy.task;

import cn.zjnktion.billy.future.WriteFuture;

import java.net.SocketAddress;

/**
 * Created by zhengjn on 2016/3/23.
 */
public interface WriteTask extends BiTask {

    boolean isEncode();

    Object getMessage();

    SocketAddress getDestination();

    WriteTask getOriginalTask();

    WriteFuture getFuture();

}
