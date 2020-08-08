package tracker;

public class Exit implements  UserAction {
    @Override
    public String name() {
        return " Exit ";
    }

    @Override
    public boolean excecute(Input input, Store tracker, Output output) {
        return false;
    }

    @Override
    public boolean excecute(Input input, Store tracker) {
        return false;
    }
}
