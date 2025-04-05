package org.maugalcst.tasktracker;

import java.util.List;

public class TaskStorage {

    private List<Task> tareas;

    public TaskStorage(List<Task> tareas) {
        this.tareas = tareas;
    }

    public List<Task> getTareas() {
        return tareas;
    }

    public static void listTasks() {}

    public static void listCompletedTasks() {}

    public static void listNotCompletedTasks() {}

    public static void listInProgressTasks() {}
}
