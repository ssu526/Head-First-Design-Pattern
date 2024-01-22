package Chapter_01_Strategy_Pattern;

import Chapter_01_Strategy_Pattern.Duck.Duck;
import Chapter_01_Strategy_Pattern.Duck.MallarDuck;
import Chapter_01_Strategy_Pattern.Duck.ModelDuck;
import Chapter_01_Strategy_Pattern.Fly.FlyWithWings;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallar = new MallarDuck();
        mallar.display();
        mallar.performQuack();
        mallar.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
