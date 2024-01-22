package Chapter_04_Factory_Pattern.FactoryMethodExample.Pizza;

public class NyStyleCheesePizza extends Pizza{
    public NyStyleCheesePizza(){
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
