package com.taskManagementSystem.taskAssigner.model;

public class TaskAssignerModel {
    private int assigneeId;
    private int[] taskIdList;

    public TaskAssignerModel() {};

    public TaskAssignerModel(int assigneeId, int[] taskIdList) {
        this.assigneeId = assigneeId;
        this.taskIdList = taskIdList;
    }

    public void setAssigneeId(int assigneeId) {
        this.assigneeId = assigneeId;
    }

    public int getAssigneeId() {
        return assigneeId;
    }

    public void setTaskIdList(int[] taskIdList) {
        this.taskIdList = taskIdList;
    }

    public int[] getTaskIdList() {
        return taskIdList;
    }
}
