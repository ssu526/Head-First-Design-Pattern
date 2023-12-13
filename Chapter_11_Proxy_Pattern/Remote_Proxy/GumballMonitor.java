package Chapter_11_Proxy_Pattern.Remote_Proxy;

import java.rmi.RemoteException;

public class GumballMonitor {
    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try{
            System.out.println("Location: " + machine.getLocation());
            System.out.println("Inventory: " + machine.getCount());
            System.out.println("State: " + machine.getState());
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
