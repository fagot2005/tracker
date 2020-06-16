package tracker;

import java.util.*;

public class Tracker {

    private final List<Item> items = new ArrayList<>();

    private String generateId() {
        Random rd = new Random();
        return String.valueOf(rd.nextInt() + System.currentTimeMillis());
    }
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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
            items.remove(index);
            result = true;
        }
        return result;
    }
}
