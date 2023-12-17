package Chapter_9_Iterator_Composite_Pattern.MenuIterator_Custom_Iterator;

public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    public MenuItem next(){
        return items[position++];
    }

    public boolean hasNext(){
        return position < items.length;
    }
}
