package tracker;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class SortByDownTest  extends TestCase {

    @Test
    public void SortByDown() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("AAA"));
        items.add(new Item("BBB"));
        items.add(new Item("CCC"));
        items.add(new Item("DDD"));
        items.add(new Item("EEE"));
        items.sort(new SortByDown());
        items.forEach(item -> System.out.println(item.getName()));
    }

    @Test
    public void SortByUp() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("MMM"));
        items.add(new Item("BBB"));
        items.add(new Item("RRR"));
        items.add(new Item("PPP"));
        items.add(new Item("EEE"));
        items.sort(new SortByUp());
        items.forEach(item -> System.out.println(item.getName()));
    }
}
