package Chapter_1_Strategy_Pattern.Duck;

import Chapter_1_Strategy_Pattern.Fly.FlyWithWings;
import Chapter_1_Strategy_Pattern.Quack.Quack;

public class MallarDuck extends Duck{
    public MallarDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am MallarDuck");
    }


}
