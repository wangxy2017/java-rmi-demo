package com.wxy.demo.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author wxy
 * @Date 19-8-22 上午9:53
 * @Description TODO
 **/
public interface IHello extends Remote {
    String sayHello() throws RemoteException;
}
