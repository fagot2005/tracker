package tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByUp implements Comparator<Item> {

    public List<Item> sortByUp(Item items) {
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        return items;
    }


    @Override
    public Comparator<Item> reversed() {
        return null;
    }
}

