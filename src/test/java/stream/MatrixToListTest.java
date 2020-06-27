package stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixToListTest {

    @Test
    public void class10A() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6),
                List.of(7, 8),
                List.of(9, 10));
        List<Integer> matrixToList = MatrixToList.matrixStream(matrix);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(matrixToList, is(expected));
    }

}
