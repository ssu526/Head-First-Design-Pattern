package Chapter_03_Decorator_Pattern.StarbuzzCoffee;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size;
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();
}
