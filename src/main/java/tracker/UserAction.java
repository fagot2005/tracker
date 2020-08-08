package tracker;

public interface UserAction {
    String name();
    boolean excecute(Input input, Store tracker, Output output);

    boolean excecute(Input input, Store tracker);
}
