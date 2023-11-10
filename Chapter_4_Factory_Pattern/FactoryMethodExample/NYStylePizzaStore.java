package Chapter_4_Factory_Pattern.FactoryMethodExample;

import Chapter_4_Factory_Pattern.FactoryMethodExample.Pizza.*;

public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NyStyleCheesePizza();
        }else if(type.equals("clam")){
            return new NyStyleClamPizza();
        }else if(type.equals("veggie")){
            return new NyStyleVeggiePizza();
        }else if(type.equals("pepperoni")){
            return new NyStylePepperoniPizza();
        }

        return null;
    }
}
