package Chapter_04_Factory_Pattern.FactoryMethodExample;

import Chapter_04_Factory_Pattern.FactoryMethodExample.Pizza.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("-----------------------\n");
        pizza = chicagoStore.orderPizza("clam");
    }
}
