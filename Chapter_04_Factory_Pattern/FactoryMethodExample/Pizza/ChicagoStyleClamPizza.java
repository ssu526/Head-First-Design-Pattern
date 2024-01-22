package Chapter_04_Factory_Pattern.FactoryMethodExample.Pizza;

public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Chicago Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
