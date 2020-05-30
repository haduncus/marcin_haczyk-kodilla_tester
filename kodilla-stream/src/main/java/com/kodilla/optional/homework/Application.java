package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jimmie", null));
        students.add(new Student("Jessie", new Teacher("Walter")));
        students.add(new Student("Gus", null));
        students.add(new Student("Kim", new Teacher("Howard")));


        for (Student student : students) {
            Optional<Teacher> optionalTeacher =
                    Optional.ofNullable(student.getTeacher());
            Teacher teacher =
                    optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacher.getName());
        }
    }
}