package org.maugalcst.tasktracker;

import java.io.*;
import java.util.List;

public class TaskStorage {

    private List<Task> tasks;

    BufferedWriter writer = new BufferedWriter(new FileWriter("taskmanager.json"));
    BufferedReader reader = new BufferedReader(new FileReader("taskmanager.json"));

    public TaskStorage(List<Task> tasks) throws IOException {
        this.tasks = tasks;
    }

    public List<Task> getTareas() {
        return tasks;
    }

    public String loadTasks() throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            String line;

            while((line = reader.readLine()) != null) {
                sb.append(line).append("\n");

            }
            return sb.toString();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        } finally {
            reader.close();
        }
    }

    public void saveTasks(List<Task> tasks) throws IOException {
        for (Task task : tasks) {
            task.toString();
            System.out.println("\n");
        }
    }


}
