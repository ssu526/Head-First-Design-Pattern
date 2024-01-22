package Chapter_04_Factory_Pattern.AbstractFactoryExample;

import Chapter_04_Factory_Pattern.FactoryMethodExample.ChicagoStylePizzaStore;
import Chapter_04_Factory_Pattern.FactoryMethodExample.NYStylePizzaStore;
import Chapter_04_Factory_Pattern.FactoryMethodExample.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        nyStore.orderPizza("cheese");
        System.out.println("\n-------------------------\n");
        chicagoStore.orderPizza("clam");
    }
}
