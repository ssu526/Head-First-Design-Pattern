package Chapter_4_Factory_Pattern.AbstractFactoryExample.PizzaStore;


import Chapter_4_Factory_Pattern.AbstractFactoryExample.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
