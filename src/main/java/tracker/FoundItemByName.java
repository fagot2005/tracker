package tracker;

import java.util.List;

public class FoundItemByName implements UserAction {

    @Override
    public String name() {
        return " Found Item By Name";
    }

    @Override
    public boolean excecute(Input input, Store tracker, Output output) {
        return false;
    }

    @Override
    public boolean excecute(Input input, Store tracker) {
        String name = input.askStr("Enter Name: ");
        List<Item> item = tracker.findByName(name);
        if (item.size() != 0) {
            System.out.println("===Id====          ===Name===");
            for (int index = 0; index < item.size(); index++) {
                System.out.println(item.get(index).getId() + "   " + item.get(index).getName());
            }
        } else {
            System.out.println("Item by Name " + name + " not found");

        }
        return true;
    }
}