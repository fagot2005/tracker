package tracker;

public class EditItemById implements UserAction {
    @Override
    public String name() {
        return " Edit Item By Id";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        Item item = new Item(id);
        tracker.replase(id, item);
        return true;
    }
}
