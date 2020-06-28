package stream;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest{

    @Test
    public void class10A() {
        List<Student> students = List.of(
                new Student(40, "Ivanov"),
                new Student(50, "Ivanovich"),
                new Student(60, "Petrov"),
                new Student(70, "Petrenko"),
                new Student(80, "Sidorov"),
                new Student(90, "Karpov"),
                new Student(95, "Smirnov"),
                new Student(45, "Catov"));
        List<Student> resalt = School.collect(students, x -> x.getScore() >= 70);
        for (Student res: resalt
        ) {
            System.out.println(res.getScore() + ", " + res.getSureName());
        }
        assertThat(resalt.size(), is(4));
    }

    @Test
    public void class10B() {
        List<Student> students = List.of(
                new Student(40, "Ivanov"),
                new Student(50, "Ivanovich"),
                new Student(60, "Petrov"),
                new Student(70, "Petrenko"),
                new Student(80, "Sidorov"),
                new Student(90, "Karpov"),
                new Student(95, "Smirnov"),
                new Student(45, "Catov"));
        List<Student> resalt = School.collect(students, x -> x.getScore() >= 50 && x.getScore() < 70);
        for (Student res: resalt
        ) {
            System.out.println(res.getScore() + ", " + res.getSureName());
        }
        assertThat(resalt.size(), is(2));
    }

    @Test
    public void class10V() {
        List<Student> students = List.of(
                new Student(40, "Ivanov"),
                new Student(50, "Ivanovich"),
                new Student(60, "Petrov"),
                new Student(70, "Petrenko"),
                new Student(80, "Sidorov"),
                new Student(90, "Karpov"),
                new Student(95, "Smirnov"),
                new Student(45, "Catov"));
        List<Student> resalt = School.collect(students, x -> x.getScore() >= 70);
        for (Student res: resalt
        ) {
            System.out.println(res.getScore() + ", " + res.getSureName());
        }
        assertThat(resalt.size(), is(4));
    }
}