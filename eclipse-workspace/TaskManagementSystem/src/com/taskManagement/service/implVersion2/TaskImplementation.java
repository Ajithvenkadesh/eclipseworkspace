package com.taskManagement.service.implVersion2;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.taskManagement.dao.TaskDao;
import com.taskManagement.model.Task;
import com.taskManagement.service.TaskService;
import com.taskManagement.view.MenuLauncher;

/**
 * Implements the methods of assignee service.
 * 
 * @author Ajithvenkadesh
 * @version 1.0
 */
public class TaskImplementation implements TaskService {
    final TaskDao TASKDAO = new TaskDao();
	
    /**
     * Calls the create new task method in task dao class.
     * 
     * @param Object of task.
     * @return Success or failure message.
     */
	public String create(final Task newTask) {
		return TASKDAO.create(newTask.getTaskName(), newTask.getTaskDescription(), 
				newTask.getTaskStatus(), newTask.getTaskStartDate(), newTask.getTaskDueDate());
	}
	
	/**
	 * Displays all task.
	 * 
	 * @return List of tasks.
	 */
	public ArrayList<Task> display() {
		return TASKDAO.dispalay();
	}
	
	/**
	 * Deletes a particular task.
	 * 
	 * @param Id of the task.
	 * @return Success or failure message.
	 */
	public String delete(final int id) {
		return TASKDAO.delete(id);
	}
	
	/**
	 * Creates new task.
	 * 
	 * @param id Id of the task.
	 * @param name Name of the task.
	 * @param description Description about the task.
	 * @param status Status of the task.
	 * @param taskStartDate Start date of the task.
	 * @param taskDueDate Due date of the task.
	 * @return Success or failure message.
	 */
	public String update(final int taskId, final String taskName,
			final String taskDescription, final String taskStatus, 
			final Date taskStartDate, final Date taskDueDate) {
		return TASKDAO.update(taskId, taskName, taskDescription, taskStatus, taskStartDate, 
				taskDueDate);
	}
	
	/**
	 * Searches a particular task.
	 * 
	 * @param id Id of the task.
	 * @return Object of task.
	 */
	public Task search(final int id) {
		return TASKDAO.search(id);
	}
	
	/**
	 * Searches task by status.
	 * 
	 * @param taskStatus Status of task.
	 * @return List of tasks.
	 */
	public ArrayList<Task> searchTaskByStatus(final String taskStatus) {
		return TASKDAO.searchTaskByStatus(taskStatus);
	}
    
	/**
	 * Generates date from string format.
	 * 
	 * @param intermediateDate Date in string format.
	 * @return Formatted date.
	 */
	public Date formatDate(final String intermediateDate) {
		try {
		    final SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		    return formatDate.parse(intermediateDate);
		} catch (ParseException e) {
			MenuLauncher.LOGGER.warning("You have entered wrong date format enter date in yyyy-MM-dd format");
			return formatDate(MenuLauncher.INPUT.nextLine());
		}
	}
}
