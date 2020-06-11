package tracker;

import junit.framework.TestCase;
import org.junit.Test;
//import ru.job4j.tracker.Item;
//import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTestSort {

    @Test
    public void whenCreateItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test3");
        tracker.add(item3);
        Item item4 = new Item("test4");
        tracker.add(item4);
        //tracker.sortByUp(tracker);
//        Item[] result = tracker.findAll();
//        assertThat(result.getName(), is(item.getName()));
    }
}