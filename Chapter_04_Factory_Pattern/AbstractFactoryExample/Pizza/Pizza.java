package Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza;

import Chapter_04_Factory_Pattern.AbstractFactoryExample.Ingredient.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie[] veggie;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
