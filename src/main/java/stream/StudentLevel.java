package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static Map<String, Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((left, right) -> left.getSureName().compareTo(right.getSureName()))
                .takeWhile(student -> student.getScore() > bound)
                .collect(Collectors.toMap(student -> student.getSureName(), student -> student));
                  //.collect(Collectors.toList());
    }
}