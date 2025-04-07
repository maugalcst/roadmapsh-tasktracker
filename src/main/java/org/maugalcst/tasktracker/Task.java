package org.maugalcst.tasktracker;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private static int nextId = 1;

    private Task(int id, String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Task(String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this(nextId++, description, status, createdAt, updatedAt);
    }

    public Task(String description, String status){
        this(description, status, null, null);
    }

    public Task(String description){
        this(description, null, null, null);
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "{" +
                "\"id\": " + id + ", " +
                "\"description\": \"" + description + "\", " +
                "\"status\": \"" + status + "\", " +
                "\"createdAt\": \"" + createdAt + "\", " +
                "\"updatedAt\": \"" + updatedAt + "\"" +
                "}";
    }

}
