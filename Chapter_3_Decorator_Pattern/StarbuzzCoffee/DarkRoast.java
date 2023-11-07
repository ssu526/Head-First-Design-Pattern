package Chapter_3_Decorator_Pattern.StarbuzzCoffee;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
