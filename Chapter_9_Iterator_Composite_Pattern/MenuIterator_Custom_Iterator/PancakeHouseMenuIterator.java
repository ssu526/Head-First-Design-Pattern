package Chapter_9_Iterator_Composite_Pattern.MenuIterator_Custom_Iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
