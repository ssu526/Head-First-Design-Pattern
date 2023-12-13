package Chapter_11_Proxy_Pattern.Remote_Proxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {

        // Locations we are going to monitor
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://austin.mightygumball.com/gumballmachine"};


        // An array of monitors
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i=0;i < location.length; i++) {
            try {
                // This returns a proxy to the remote Gumball Machine
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
