package tracker;

import java.util.List;

public class ShowAllItems implements UserAction {

    @Override
    public String name() {
        return " Show All Items";
    }

    @Override
    public boolean excecute(Input input, Store tracker, Output output) {
        return false;
    }

    @Override
    public boolean excecute(Input input, Store tracker) {
        List<Item> item = tracker.findAll();
        System.out.println("===Id====          ===Name===");
        for (int index = 0; index < item.size(); index++) {
            if (item.get(index) != null) {
                System.out.println(item.get(index).getId() + "   " + item.get(index).getName());
            }
        }return true;
    }
}
