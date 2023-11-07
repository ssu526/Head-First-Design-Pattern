package Chapter_3_Decorator_Pattern.StarbuzzCoffee;

public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.1;
    }


}
