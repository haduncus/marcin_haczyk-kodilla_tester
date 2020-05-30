package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Pay of the phone bill", LocalDate.of(2020, 5, 1), LocalDate.of(2020, 5, 7)));
        taskList.add(new Task("Buy new laptop", LocalDate.of(2020, 5, 15), LocalDate.of(2020, 5, 16)));
        taskList.add(new Task("Send documents to costumer", LocalDate.of(2020, 5, 31), LocalDate.of(2020, 6, 20)));
        taskList.add(new Task("Pay of credit card", LocalDate.of(2020, 5, 28), LocalDate.of(2020, 5, 7)));
        taskList.add(new Task("Pick up a birthday cake", LocalDate.of(2020, 10, 2), LocalDate.of(2020, 10, 7)));
        taskList.add(new Task("Return the rented car", LocalDate.of(2020, 8, 20), LocalDate.of(2020, 9, 7)));
        taskList.add(new Task("Complete a grant application", LocalDate.of(2020, 5, 8), LocalDate.of(2020, 5, 21)));
        return taskList;
    }
}