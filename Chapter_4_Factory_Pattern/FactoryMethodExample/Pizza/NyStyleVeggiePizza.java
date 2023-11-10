package Chapter_4_Factory_Pattern.FactoryMethodExample.Pizza;

public class NyStyleVeggiePizza extends Pizza{
    public NyStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
