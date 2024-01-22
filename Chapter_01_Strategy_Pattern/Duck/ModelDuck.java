package Chapter_01_Strategy_Pattern.Duck;

import Chapter_01_Strategy_Pattern.Fly.FlyNoWay;
import Chapter_01_Strategy_Pattern.Quack.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am ModelDuck");
    }
}
