package org.maugalcst.tasktracker;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(int id) {
        this.id = id;
    }

    public Task(int id, String description){
        this(id);
        this.description = description;
    }

    public Task(int id, String description, String status){
        this(id, description);
        this.status = status;
    }

    public Task(int id, String description, String status, LocalDateTime createdAt){
        this(id, description, status);
        this.createdAt = createdAt;
    }

    public Task(int id, String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this(id, description, status, createdAt);
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public static void addTask() {

    }

    public static void updateTask() {}

    public static void deleteTask() {}

    public static void listTasks() {}

    public static void listCompletedTasks() {}

    public static void listNotCompletedTasks() {}

    public static void listInProgressTasks() {}
}
