package Chapter_4_Factory_Pattern.AbstractFactoryExample.PizzaStore;

import Chapter_4_Factory_Pattern.AbstractFactoryExample.IngredientFactory.ChicagoPizzaIngredientFactory;
import Chapter_4_Factory_Pattern.AbstractFactoryExample.IngredientFactory.IngredientFactory;
import Chapter_4_Factory_Pattern.AbstractFactoryExample.Pizza.CheesePizza;
import Chapter_4_Factory_Pattern.AbstractFactoryExample.Pizza.ClamPizza;
import Chapter_4_Factory_Pattern.AbstractFactoryExample.Pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        }
        return pizza;
    }
}
