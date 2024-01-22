package Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory;

import Chapter_04_Factory_Pattern.AbstractFactoryExample.Ingredient.*;

public class ChicagoPizzaIngredientFactory implements IngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggie() {
        return new Veggie[]{new EggPlant(), new Spinach()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
