package MPP_Labs.Lab2.prob2A;

import java.util.*;

public class Student {
    private String name;
    private GradeReport grade;

    public Student(String name){
        this.name = name;
        grade = new GradeReport(this);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rustem"));
        students.add(new Student("Joseph"));
        students.add(new Student("Jamal"));
    }
}
