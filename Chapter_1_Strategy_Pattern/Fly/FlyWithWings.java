package Chapter_1_Strategy_Pattern.Fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I am flying!!");
    }
}
