package Chapter_9_Iterator_Composite_Pattern.MenuIterator_Composite_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;
    Iterator iterator = null;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.println("     -- " + getDescription());
        System.out.println("-------------------------------");

        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
        /*
        We use it to iterate through all the Menu’s  components... those could be other Menus,
        or they could be MenuItems. Since both  Menus and MenuItems implement print(), we just
        call print() and the rest is up to them.
         */
    }

    public Iterator<MenuComponent> createIterator(){
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
