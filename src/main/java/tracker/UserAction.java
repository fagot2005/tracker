package tracker;

public interface UserAction {
    String name();
    boolean excecute(Input input, Tracker tracker);
}
