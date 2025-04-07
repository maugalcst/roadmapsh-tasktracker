package org.maugalcst.tasktracker;

public enum TaskStatusEnum {
    DONE("done"),
    IN_PROGRESS("in progress"),
    TODO("to do");

    final String status;

    TaskStatusEnum(String status) {
        this.status = status;
    }
}
