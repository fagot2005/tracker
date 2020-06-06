package tracker;

public class DeleteItemById implements UserAction {
    @Override
    public String name() {
        return " Delete Item By Id";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String name = input.askStr("Enter ID: ");
        return tracker.delete(name)?true:false;
    }
}
