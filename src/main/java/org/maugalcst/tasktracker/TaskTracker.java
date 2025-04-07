package org.maugalcst.tasktracker;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskTracker {
    public static void main(String[] args) throws IOException {

        List<Task> tasklist = new ArrayList<>();
        TaskStorage ts = new TaskStorage(tasklist);

        try {
            int i = 0;
            if (Objects.equals(args[0], "add") && args[1] != null) {
                tasklist.add(new Task(args[1], TaskStatusEnum.TODO.status, LocalDateTime.now(), LocalDateTime.now()));
                addTask(tasklist.getLast());
            } else if (Objects.equals(args[0], "list") && args[1] == null) {
                if (!tasklist.isEmpty()) {
                    System.out.println(tasklist);
                } else {
                    System.out.println("Empty tasks list.");
                }
            }
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void addTask(Task last) {

    }

    public static void updateTask() {}

    public static void deleteTask() {}

    public void markAsCompleted() {}

    public void markInProgress() {}

    public void listTasks() {}

    public void listCompletedTasks() {}

    public void listNotCompletedTasks() {}

    public void listInProgressTasks() {}


}