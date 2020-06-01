package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> toDoDatesList = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now())
                        && task.getDeadline().isBefore(LocalDate.of(2020, 06, 01)))
                .map(TaskManager::getDeadlineDate)
                .collect(Collectors.toList());
        System.out.println(toDoDatesList);
    }

    public static LocalDate getDeadlineDate(Task task) {
        return task.getDeadline();
    }
}