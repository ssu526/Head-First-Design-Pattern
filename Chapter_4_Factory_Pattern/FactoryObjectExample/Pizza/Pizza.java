package Chapter_4_Factory_Pattern.FactoryObjectExample.Pizza;

public abstract class Pizza {
    public void prepare(){
        System.out.println("Preparing");
    }

    public void bake(){
        System.out.println("Baking");
    }

    public void cut(){
        System.out.println("Cutting");
    }

    public void box(){
        System.out.println("Box");
    }
}
