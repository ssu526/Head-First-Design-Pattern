package Chapter_04_Factory_Pattern.AbstractFactoryExample.Pizza;

import Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory.IngredientFactory;

public class ClamPizza extends Pizza{
    IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
        ingredientFactory.createSauce();
        ingredientFactory.createClams();
        ingredientFactory.createVeggie();
    }
}
