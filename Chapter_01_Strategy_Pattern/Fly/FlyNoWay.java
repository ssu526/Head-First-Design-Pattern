package Chapter_01_Strategy_Pattern.Fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I cannot fly...");
    }
}
