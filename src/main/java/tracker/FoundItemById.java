package tracker;

public class FoundItemById implements UserAction {
    @Override
    public String name() {
        return " Found Item By Id";
    }

    @Override
    public boolean excecute(Input input, Store tracker, Output output) {
        return false;
    }

    @Override
    public boolean excecute(Input input, Store tracker) {
        String id = input.askStr("Enter ID: ");
        //Item item = new Item(name);
        //tracker.findById(name);
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("===Id====          ===Name===");
            System.out.println(item.getId() + "   " + item.getName());
        } else System.out.println("Item to ID " + id + " not found");
        return true;
    }
}
