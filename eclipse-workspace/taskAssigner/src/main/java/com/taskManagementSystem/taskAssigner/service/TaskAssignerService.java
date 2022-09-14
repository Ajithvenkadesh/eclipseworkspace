package com.taskManagementSystem.taskAssigner.service;

import com.taskManagementSystem.taskAssigner.model.Task;
import com.taskManagementSystem.taskAssigner.model.TaskAssignerModel;
import java.util.ArrayList;

/**
 * Lists the services available for mapping a task.
 * 
 * @author Ajith venkadesh.
 * @version 1.0
 *
 */
public interface TaskAssignerService {
	
	/**
	 * Assigns task to assignees.
	 * 
	 * @param taskAssignerModel Id of the assignee.
	 */
	public void assignTask(final TaskAssignerModel taskAssignerModel);
		
	/**
	 * Searches task assigned to assignee by using
	 * assignee id.
	 * 
	 * @param assigneeId Id of the assignee.
	 * @return list of tasks.
	 */
	public ArrayList<Task> searchTaskByAssigneeId(final int assigneeId);
}
