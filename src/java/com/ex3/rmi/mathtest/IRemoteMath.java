package com.ex3.rmi.mathtest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 必须继承Remote接口
 * 所有参数和返回类型必须序列化
 * 任意远程对象必须实现此接口
 * 只有远程接口中指定的方法可以调用
 */
public interface IRemoteMath extends Remote {
    /*
     *  所有方法必须抛出RemoteException
     */
    int add(int a, int b) throws RemoteException;

    int sub(int a, int b) throws RemoteException;
}
