package tracker;

import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class SortByDownTest {

    @Test
    public void SortByDown() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("AAA"));
        items.add(new Item("BBB"));
        List<Item> excpected = new ArrayList<>();
        excpected.add(new Item("AAA"));
        excpected.add(new Item("BBB"));
        items.sort(new SortByDown());
        assertEquals(items, excpected);
    }

    @Test
    public void SortByUp() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("AAA"));
        items.add(new Item("BBB"));
        List<Item> excpected = new ArrayList<>();
        excpected.add(new Item("BBB"));
        excpected.add(new Item("AAA"));
        items.sort(new SortByUp());
        assertEquals(items, excpected);
    }
}
