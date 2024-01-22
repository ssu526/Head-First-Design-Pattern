package Chapter_03_Decorator_Pattern.StarbuzzCoffee;

public class Decaf extends Beverage{
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
