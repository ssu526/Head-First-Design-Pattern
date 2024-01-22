package Chapter_04_Factory_Pattern.AbstractFactoryExample.PizzaStore;


import Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory.IngredientFactory;
import Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory.NYPizzaIngredientFactory;
import Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza.CheesePizza;
import Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza.ClamPizza;
import Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Cheese Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Clam Pizza");
        }

        return pizza;
    }
}
