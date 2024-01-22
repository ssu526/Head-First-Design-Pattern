package Chapter_07_Adapter_Facade_Pattern.Duck;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
