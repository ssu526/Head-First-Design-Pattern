package Chapter_09_Iterator_Composite_Pattern.MenuIterator_Java_Iterator;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
