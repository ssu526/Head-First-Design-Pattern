package Chapter_09_Iterator_Composite_Pattern.MenuIterator_Java_Iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.length;
    }

    @Override
    public Object next() {
        return list[position++];
    }

    @Override
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(list[position-1] != null){
            for(int i = position-1; i < (list.length-1); i++){
                list[i] = list[i+1];
            }
            list[list.length] = null;
        }
    }
}
