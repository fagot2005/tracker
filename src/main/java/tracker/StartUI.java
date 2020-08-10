package tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            System.out.println();
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
        for (int i = 0; i < actions.length; i++) {
            out.prinln(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        try (Store tracker = new SqlTracker()) {
            tracker.init();
            UserAction[] actions = {new CreateAction(output), new ShowAllItems(),
                    new EditItemById(), new DeleteItemById(), new FoundItemById(),
                    new FoundItemByName(), new Exit()};
            new StartUI(output).init(input, tracker, actions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
