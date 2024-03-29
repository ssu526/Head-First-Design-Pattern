package Chapter_02_Observer_Pattern.Subject;

import Chapter_02_Observer_Pattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
