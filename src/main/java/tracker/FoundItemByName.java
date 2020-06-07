package tracker;

public class FoundItemByName implements UserAction {

    @Override
    public String name() {
        return " Found Item By Name";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        Item[] item = tracker.findByName(name);
        if (item != null) {
            System.out.println("===Id====          ===Name===");
            for (int index = 0; index < item.length; index++) {
                System.out.println(item[index].getId() + "   " + item[index].getName());
            }
        } else {
            System.out.println("Item by Name " + name + " not found");

        }
        return true;
    }
}