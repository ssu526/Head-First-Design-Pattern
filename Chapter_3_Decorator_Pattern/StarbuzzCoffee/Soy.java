package Chapter_3_Decorator_Pattern.StarbuzzCoffee;

public class Soy extends CondimentDecorator{
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost(){
        double cost = beverage.cost();

        if(getSize() == Size.TALL){
            cost = cost + 0.1;
        }else if(getSize() == Size.GRANDE){
            cost = cost + 0.15;
        }else if(getSize() == Size.VENTI){
            cost = cost + 0.2;
        }

        return cost;
    }
}
