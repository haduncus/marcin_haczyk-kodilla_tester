package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jimmie"));
        students.add(new Student("Jessie", new Teacher("Walter")));
        students.add(new Student("Gus"));
        students.add(new Student("Kim", new Teacher("Howard")));

        for (Student student : students) {
            System.out.println("Student: " + student.getStudentName() + ", Teacher: " + student.getTeacher());
        }
    }
}