package Chapter_11_Proxy_Pattern.RMI_Example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says hi";
    }

    public static void main(String[] args){
        try{
            /*
            Register the remote service with the RMI registry, so that it is available to remote clients.
            When you register the implementation  object, the RMI system actually puts the stub in the
            registry, since that’s what the client really needs
             */
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("REmoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
The class that does the real work.
It has the real implementation of the remote methods defined in the remote interface.
It's the object that the client wants to call the methods on.
 */