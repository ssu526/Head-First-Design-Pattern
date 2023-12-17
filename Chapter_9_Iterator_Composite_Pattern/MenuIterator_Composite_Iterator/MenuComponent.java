package Chapter_9_Iterator_Composite_Pattern.MenuIterator_Composite_Iterator;

import java.util.Iterator;

public abstract class MenuComponent {
    /*
    MenuComponent provides default implementation for every method.

    Because some of these methods only make sense  for MenuItems,
    and some only make sense for Menus, the default implementation is
    UnsupportedOperationException. That way, if MenuItem or Menu doesn’t
    support an operation, they don’t have to do anything, they can just
    inherit the default implementation.
    */

    /*
    Composite methods - methods to add, remove and get MenuComponents
    */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /*
    Operation methods - used by the MenuItems. Couple of them can be used in Menu too.
    */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    /*
    An operation method for both menus and MenuItem
    */
    public void print(){
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<MenuComponent> createIterator();
}
