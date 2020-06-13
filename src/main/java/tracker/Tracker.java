package tracker;

import java.util.*;

import static java.util.List.copyOf;

public class Tracker {

    private final List<Item> items = new ArrayList<>();

    private String generateId() {
        Random rd = new Random();
        return String.valueOf(rd.nextLong() + System.currentTimeMillis());
    }
    public Item add(Item item) {
        item.setId(generateId());
        return item;
    }
    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> newItemsArray = new ArrayList<>();
        int newSize = 0;
        for (Item x : newItemsArray
        ) {
            newItemsArray.add(x);
        }
        return items;
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
            items.set(index, item);
            result = true;
        }
        return result;
    }

//    private int index(String id) {
//        int rls = -1;
//        for (int index = 0; index < items.size(); index++) {
//            if (items.get(index).getId().equals(id)) {
//                rls = index;
//                break;
//            }
//        } return rls;
//    }
    private int indexOf(String id) {
        int rls = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rls = index;
                break;
            }
        }
        return rls;
    }
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            //System.arraycopy(items, index + 1, items, index, items.size() - index);
            items.remove(index);
            result = true;
        }
        return result;
    }
}
