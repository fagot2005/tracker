package tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDown implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
