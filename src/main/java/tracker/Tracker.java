package tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.util.List.copyOf;

public class Tracker {

    private final ArrayList<Item> items = new ArrayList<>();//Item[] items = new Item[100];
    //private int positions = 0;

    private String generateId() {
        Random rd = new Random();
        return String.valueOf(rd.nextLong() + System.currentTimeMillis());

    }

    public Item add(Item item) {
        item.setId(generateId());
        //items[positions++] = item;
        return item;
    }

    public ArrayList<Item> findAll() {
        ArrayList cloneItem = (ArrayList) items.clone();
        return cloneItem;
                  //copyOf(items);
        //ArraysList<Item>.copyOf(items, positions);
    }


    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> newItemsArray = new ArrayList<>();
        //Item[] newItemsArray = new Item[positions];
        int newSize = 0;
        for (Item x: newItemsArray
        ) {
            newItemsArray.add(x);
        }
//        for (int i = 0; i < positions; i++) {
//            if (items[i].getName().equals(key)) {
//                newItemsArray[i] = items[i];
//                newSize++;
//            }
//        }
        ArrayList cloneItem = (ArrayList) items.clone();
        return cloneItem;
        //return ArrayList<Item>.copyOf(newItemsArray);
        //Arrays.copyOf(newItemsArray, newSize);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replase(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.get(index) = item;
            //items[index] = item;
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
        for (Item x: items
             ) {
            if (x.getId(id).equals(id)) {
                rls = x;
                break;
            }
        }
//        for (int index = 0; index < positions; index++) {
//            if (items.get(index).getId().equals(id)) {
//                rls = index;
//                break;
//            }
//        }

//            if (items[index].getId().equals(id)) {
//                rls = index;
//                break;
        return rls;
            }
   // }
//}
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
