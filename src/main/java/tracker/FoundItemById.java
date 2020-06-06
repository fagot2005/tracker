package tracker;

public class FoundItemById implements UserAction {
    @Override
    public String name() {
        return " Found Item By Id";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String id = input.askStr("Enter ID: ");
        //Item item = new Item(name);
        //tracker.findById(name);
        System.out.println("===Id====          ===Name===");
        System.out.println(tracker.findById(id).getId() + "   " + tracker.findById(id).getName());
        return true;
    }
}
