package Chapter_7_Adapter_Facade_Pattern.Duck;

public class SuperDrone implements Drone{

    @Override
    public void beep() {
        System.out.println("Beep beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void take_off() {
        System.out.println("Taking off!");
    }
}
