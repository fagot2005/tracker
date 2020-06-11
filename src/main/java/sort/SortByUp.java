package sort;

import tracker.Item;

import java.util.Arrays;
import java.util.Collections;

public class SortByUp{
    public Item[] sortByUp(Item[] items) {
        Arrays.sort(items);
        System.out.println(items);
        Arrays.sort(items, Collections.reverseOrder());
        System.out.println(items);
        return items;
    }
}

