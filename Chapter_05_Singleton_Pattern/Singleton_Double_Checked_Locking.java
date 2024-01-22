package Chapter_05_Singleton_Pattern;

public class Singleton_Double_Checked_Locking {
    private volatile static Singleton_Double_Checked_Locking uniqueInstance;

    private Singleton_Double_Checked_Locking(){};

    public static Singleton_Double_Checked_Locking getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton_Double_Checked_Locking();
                }
            }
        }
        return uniqueInstance;
    }
}
