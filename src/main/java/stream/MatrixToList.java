package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6),
                List.of(7, 8),
                List.of(9, 10));
        //matrixStream(matrix);
        System.out.println(matrixStream(matrix));
    }

    public static List<Integer> matrixStream (List<List<Integer>> matrix) {
        return matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
    }
}
