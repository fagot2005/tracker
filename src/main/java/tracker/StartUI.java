package tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public static void criateItem(Input input, Tracker tracker) {
        String name = input.askStr("Enter Name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public static void repleseItem(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Edit Item by Id===");
        String id = input.askStr("Enter Id: ");
        String name = input.askStr("Enter newName: ");
        Item item = new Item(name);
        if (tracker.replase(id, item)) {
            System.out.println("Item " + id + " replase Name successfully");
        } else {
            System.out.println("Item " + id + " not found");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Delete Item by Id===");
        String id = input.askStr("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item " + id + " deleted successfully");
        } else {
            System.out.println("Item " + id + " not found");
        }
    }
    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Show all Item===");
        Item[] itemsNew = tracker.findAll();
        System.out.println("===Id====          ===Name===");
        for (int index = 0; index < itemsNew.length; index++) {
            if (itemsNew[index] != null) {
                System.out.println(itemsNew[index].getId() + "   " + itemsNew[index].getName());
            }
        }
    }
    public static void foundItemById(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Found Item by Id===");
        String name = input.askStr("Enter Id: ");
        Item item = tracker.findById(name);
        System.out.println("===Show Item by Id===");
        System.out.println("===Id====          ===Name===");
        System.out.println(item.getId() + "   " + item.getName());
    }
    public static void foundItemByName(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Found Item by Name===");
        String name = input.askStr("Enter Name: ");
        Item[] item = tracker.findByName(name);
        System.out.println("===Show Item by Name===");
        System.out.println("===Id====          ===Name===");
        for (int index = 0; index < item.length; index++) {
            if (item[index] != null) {
                System.out.println(item[index].getId() + "   " + item[index].getName());
            }
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            System.out.println("");
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.prinln("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.excecute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.prinln("Menu.");
        for (int i = 0; i<actions.length; i++) {
            out.prinln(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = { new CreateAction(output), new ShowAllItems(),
                new EditItemById(), new DeleteItemById(), new FoundItemById(),
                new FoundItemByName(), new Exit()};
        new StartUI(output).init(input, tracker, actions);
    }
}
