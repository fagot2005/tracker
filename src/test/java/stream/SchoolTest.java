package stream;

import junit.framework.TestCase;

import java.util.List;

public class SchoolTest extends TestCase {

    public void testCollect() {
        List<Student> students = List.of(
                new Student(40, "Ivanov"),
                new Student(50, "Ivanovich"),
                new Student(60, "Petrov"),
                new Student(70, "Petrenko"),
                new Student(80, "Sidorov"),
                new Student(90, "Karpov"),
                new Student(95, "Smirnov"),
                new Student(45, "Catov"));
        School.collect(students, x -> students.getScore() < 50);
    }
}