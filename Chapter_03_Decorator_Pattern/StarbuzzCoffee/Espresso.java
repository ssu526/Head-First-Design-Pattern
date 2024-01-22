package Chapter_03_Decorator_Pattern.StarbuzzCoffee;

public class Espresso extends Beverage{
    public Espresso(){
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
