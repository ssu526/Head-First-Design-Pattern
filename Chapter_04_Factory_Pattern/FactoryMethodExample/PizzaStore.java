package Chapter_04_Factory_Pattern.FactoryMethodExample;

import Chapter_04_Factory_Pattern.FactoryMethodExample.Pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);  // Factory method

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
