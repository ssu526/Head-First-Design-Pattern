package Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza;

import Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory.IngredientFactory;

public class CheesePizza extends Pizza{
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggie = ingredientFactory.createVeggie();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
