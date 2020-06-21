package stream;

import java.util.Objects;

public class Student {

    private int score;
    private String sureName;


    public Student(int score, String sureName) {
        this.score = score;
        this.sureName = sureName;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(sureName, student.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, sureName);
    }
}
