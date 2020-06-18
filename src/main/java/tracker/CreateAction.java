package tracker;

public class CreateAction implements UserAction {
public final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return " Create new Item";
    }

    @Override
    public boolean excecute(Input input, Tracker tracker, Output output) {
        out.prinln("Item was added");
        return excecute(input, tracker);
    }

    @Override
    public boolean excecute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
