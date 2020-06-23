package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st != null)
                .sorted((left, right) -> left.getSureName().compareTo(right.getSureName()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}
