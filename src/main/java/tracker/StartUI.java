package tracker;

public class StartUI {
    public static void criateItem(Input input, Tracker tracker) {
        System.out.println("");
        System.out.println("===Greate new Item===");
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

    public void unit(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("");
            int selest = Integer.valueOf(input.askStr("==Select=="));
            if (selest == 0) {
                StartUI.criateItem(input, tracker);
            } else if (selest == 1) {
                StartUI.showAllItem(input, tracker);
            } else if (selest == 2) {
                StartUI.repleseItem(input, tracker);
            } else if (selest == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (selest == 4) {
                StartUI.foundItemById(input, tracker);
            } else if (selest == 5) {
                StartUI.foundItemByName(input, tracker);
            } else if (selest == 6) {
                run = false;
            } else {
                System.out.println("The menu item is not correct, select from 1-6");
                run = true;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu");
        System.out.println("0. Add");
        System.out.println("1. Show");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Find ID");
        System.out.println("5. Find Name");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().unit(input, tracker);
    }
}
