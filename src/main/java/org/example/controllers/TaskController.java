package org.example.controllers;

import org.example.models.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaskController {
    private ObservableList<Task> tasks;

    public TaskController() {
        tasks = FXCollections.observableArrayList();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ObservableList<Task> getTasks() {
        return tasks;
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}