package Chapter_11_Proxy_Pattern.RMI_Example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}

/*
Defines the methods that a client can call remotely.
It's what the client will use as the class type for you service.
Both the stub and actual service will implement this.

The return value is gonna be shipped over the wire from the server
back to the client, so it must be serializable.
 */
