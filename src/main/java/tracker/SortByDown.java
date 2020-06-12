package tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDown implements Comparator<Item> {

    public List<Item> sortByUp(Item[] items) {
        System.out.println(items);
        Collections.sort(items, Comparator<items>.reverseOrder());
        System.out.println(items);
        return items;
    }
}
