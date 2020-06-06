package tracker;

public class StubOutput implements Output{

    private final StringBuilder bufer = new StringBuilder();

    @Override
    public void prinln(Object obj) {
        if (obj != null) {
            bufer.append(obj.toString());
        } else bufer.append("null");
        bufer.append(System.lineSeparator());
    }

    @Override
    public String toString() {
        return bufer.toString();
    }
}
