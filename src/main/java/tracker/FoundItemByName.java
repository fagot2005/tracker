package tracker;

public class FoundItemByName implements UserAction {

    @Override
    public String name() {
        return " Found Item By Name";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        //Item item = new Item(name);
        //tracker.findById(name);
        Item[] item = tracker.findByName(name);
        if (item != null) {
            System.out.println("===Show Item by Name===");
            System.out.println("===Id====          ===Name===");
            for (int index = 0; index < item.length; index++) {
                if (item[index] != null) {
                    System.out.println(item[index].getId() + "   " + item[index].getName());
                }
            }
        } else System.out.println("Item by Name " + name + " not found");
        return true;
    }
}
