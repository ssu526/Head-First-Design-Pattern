package Chapter_5_Singleton_Pattern;

public class Singleton_Eager_Instantiation {
    private static Singleton_Eager_Instantiation uniqueInstance = new Singleton_Eager_Instantiation();

    private Singleton_Eager_Instantiation(){};

    public static Singleton_Eager_Instantiation getInstance(){
        return uniqueInstance;
    }
}
