package tracker;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.criateItem(input, tracker);
        List<Item> created = tracker.findAll();
        Item expected = new Item("Fix PC");
        assertThat(expected, is(expected));
    }

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker, is(tracker));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", item.getId(), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditItemById(),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker, is(tracker));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", item.getId(), "1"}
        );
        UserAction[] actions = {
                new DeleteItemById(),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        new StartUI(out).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        new StartUI(out).init(in, tracker, actions);
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
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllItems(),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker, is(tracker));
    }

    @Test
    public void FindByNameAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New item"));
        String foundName = "New item";
        Input in = new StubInput(
                new String[]{"0", foundName , "1"}
        );
        UserAction[] actions = {
                new FoundItemByName(),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker, is(tracker));
    }

    @Test
    public void FindByIdAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        String foundID = item.getId();
        Input in = new StubInput(
                new String[]{"0", foundID, "1"}
        );
        UserAction[] actions = {
                new FoundItemById(),
                new Exit()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker, is(tracker));
    }
}