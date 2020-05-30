package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(int... numberOfStudents) {
        for (int students : numberOfStudents) {
            this.numberOfStudents.add(students);
        }
    }

    public List<Integer> getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(numberOfStudents, school.numberOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfStudents);
    }
}