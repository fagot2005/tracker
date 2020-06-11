package tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int positions = 0;

    private String generateId() {
        Random rd = new Random();
        return String.valueOf(rd.nextLong() + System.currentTimeMillis());

    }

    public Item add(Item item) {
        item.setId(generateId());
        items[positions++] = item;
        return item;
    }

     public Item[] findAll() {
        return Arrays.copyOf(items, positions);
    }


    public Item[] findByName(String key) {
        Item[] newItemsArray = new Item[positions];
        int newSize = 0;
        for (int i = 0; i < positions; i++) {
            if (items[i].getName().equals(key)) {
                newItemsArray[i] = items[i];
                newSize++;
            }
        }
        return Arrays.copyOf(newItemsArray, newSize);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replase(String id, Item item) {
       boolean result = false;
       int index = indexOf(id);
       if (index != -1) {
           item.setId(id);
           items[index] = item;
           result = true;
       }
       return result;
    }

//    private int index(String id) {
//        int rls = -1;
//        for (int index = 0; index < positions; index++) {
//            if (items[index].getId().equals(id)) {
//                rls = index;
//                break;
//            }
//        } return rls;
//    }

    private int indexOf(String id) {
        int rls = -1;
        for (int index = 0; index < positions; index++) {
            if (items[index].getId().equals(id)) {
                rls = index;
                break;
            }
        } return rls;
    }
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items,index + 1, items, index, positions - index);
            items[positions - 1] = null;
            positions = positions - 1;
            result = true;
        }
        return result;
    }


}
