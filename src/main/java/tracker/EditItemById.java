package tracker;

public class EditItemById implements UserAction {
    @Override
    public String name() {
        return " Edit Item By Id";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        String newName = input.askStr("New name Item: ");
        Item item = new Item(id);
        if (tracker.replase(id, item)) {
            System.out.println("Replase was succesfully");
        } else {
            System.out.println("ERROR");
        }
        return true;
    }
}
