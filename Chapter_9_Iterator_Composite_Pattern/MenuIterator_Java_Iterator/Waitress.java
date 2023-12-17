package Chapter_9_Iterator_Composite_Pattern.MenuIterator_Java_Iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;

    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            System.out.println("---- MENU ----");
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
    }
}
