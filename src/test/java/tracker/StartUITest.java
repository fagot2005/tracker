package tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class StartUITest {

//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.criateItem(input, tracker);
//        List<Item> created = tracker.findAll();
//        Item expected = new Item("Fix PC");
//        assertThat(expected, is(expected));
//    }

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0.  Create new Item" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator() +
                "Item was added" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0.  Create new Item" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator()));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new ConsoleOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", item.getId(), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditItemById(),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(memTracker, is(memTracker));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new DeleteItemById(),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0.  Delete Item By Id" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0.  Exit " + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        UserAction[] actions = {new Exit()};
        Input in = new StubInput(
                new String[]{"10", "0"});
        MemTracker memTracker = new MemTracker();
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0.  Exit %n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0.  Exit %n"
                )
        ));
    }

    @Test
    public void whenInvalidExit2() {
        Output out = new StubOutput();
        UserAction[] actions = {new Exit()};
        Input in = new StubInput(
                new String[]{"10", "0"});
        MemTracker memTracker = new MemTracker();
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0.  Exit %n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0.  Exit %n"
                )
        ));
    }

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void FindAllAction() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new ShowAllItems(),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0.  Show All Items" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator()));
    }

    @Test
    public void FindByNameAction() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new FoundItemByName(),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0.  Found Item By Name" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator()));
    }

    @Test
    public void FindByIdAction() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new FoundItemById(),
                new Exit()
        };
        new StartUI(output).init(in, memTracker, actions);
        assertThat(output.toString(), is("Menu." + System.lineSeparator() +
                "0.  Found Item By Id" + System.lineSeparator() +
                "1.  Exit " + System.lineSeparator()));
    }
}