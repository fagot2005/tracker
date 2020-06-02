package tracker;

public class StubInput implements Input {
    private String[] ansver;
    private int position = 0;

    public StubInput(String[] ansver) {
        this.ansver = ansver;
    }

    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
