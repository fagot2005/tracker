package tracker;

public class ShowAllItems implements UserAction {

    @Override
    public String name() {
        return " Show All Items";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        //String name = input.askStr("Enter name");
        Item[] item = tracker.findAll();
        System.out.println("===Id====          ===Name===");
        for (int index = 0; index < item.length; index++) {
            if (item[index] != null) {
                System.out.println(item[index].getId() + "   " + item[index].getName());
            }
        }return true;
    }
}
