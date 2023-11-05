package Chapter_1_Strategy_Pattern.Quack;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
