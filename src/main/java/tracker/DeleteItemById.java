package tracker;

public class DeleteItemById implements UserAction {
    @Override
    public String name() {
        return " Delete Item By Id";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String name = input.askStr("Enter ID: ");
        if (tracker.delete(name)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Deleting fallen. Invalid id");
        }
        return true;
    }
}
