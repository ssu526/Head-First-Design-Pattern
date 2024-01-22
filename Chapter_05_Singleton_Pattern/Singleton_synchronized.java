package Chapter_05_Singleton_Pattern;

public class Singleton_synchronized {
    private static Singleton_synchronized uniqueInstance;

    private Singleton_synchronized(){};

    private synchronized static Singleton_synchronized getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton_synchronized();
        }
        return  uniqueInstance;
    }
}
