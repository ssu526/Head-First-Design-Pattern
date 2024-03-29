package Chapter_04_Factory_Pattern.AbstractFactoryExample.IngredientFactory;

import Chapter_04_Factory_Pattern.AbstractFactoryExample.Ingredient.*;

public interface IngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggie();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
