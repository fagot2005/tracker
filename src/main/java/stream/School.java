package stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public  List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> collect10A = students.stream().filter(student -> student.getScore()>=70).collect(Collectors.toList());
        collect10A.forEach(System.out::println);
                List<Student> collect10B = students.stream().filter(student -> student.getScore()>=50 && student.getScore()<70).collect(Collectors.toList());
        collect10B.forEach(System.out::println);
                List<Student> collect10V = students.stream().filter(student -> student.getScore()<50).collect(Collectors.toList());
        collect10V.forEach(System.out::println);
    }
}
