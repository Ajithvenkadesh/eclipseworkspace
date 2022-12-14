package com.taskManagement.view;

import com.taskManagement.controller.TaskAssignerController;
import com.taskManagement.controller.TaskController;
import com.taskManagement.model.Task;
import com.taskManagement.validation.Validator;

/**
 * List various operations available for
 * creating, reading, updating, deleting 
 * task.
 * 
 * @author Ajith venkadesh.
 * @version 1.0
 */
public class TaskMenu {
	
	/**
	 * Displays all the options available for editing task,
	 * assigning task to assignees.
	 */
	public void displayOptions() {
	    final TaskController controller = new TaskController();
        final AssigneeMenu menu = new AssigneeMenu();
        final Validator validator = new Validator();
        final TaskDetails details = new TaskDetails();
        final TaskAssignerController taskAssigner = new TaskAssignerController();
                
        System.out.println ("\n Enter 1 for creating new task"
		        + "\n Enter 2 for displaying all task"
		        + "\n Enter 3 for updating a partcular task"
		        + "\n Enter 4 for deleting a particular task"
		        + "\n Enter 5 searching a particular task"
		        + "\n Enter 6 to assign task"
		        + "\n Enter 7 to search task by status"
		        + "\n Enter 8 to list the task assigned to assignee"
		        + "\n Enter 9 to move to assignee menu ");
        int choice = MenuLauncher.INPUT.nextInt();
        MenuLauncher.INPUT.nextLine();
        
        switch (choice) {
        case 1 :
        	final Task task = new Task(details.getTaskId(), validator.validateName(details.getTaskName()), 
        			details.getTaskDescription(), validator.validateStartDate(details.getStartDate()),
        			validator.validateDueDate(details.getDueDate()), details.getTaskStatus());
        	System.out.println (controller.createTask(task));
        	break;
        case 2 :
        	details.printAllTask(controller.displayTask());
        	break;
        case 3 :
        	System.out.println (controller.updateTask(validator.validateTaskId(details.getTaskId()),
        			validator.validateName(details.getTaskName()), details.getTaskDescription(),
        			details.getTaskStatus(), validator.validateStartDate(details.getStartDate()), 
        			validator.validateDueDate(details.getDueDate())));
        	break;
        case 4 :
        	System.out.println (controller.deleteTask(validator.validateTaskId(details.getTaskId())));
        	break;
        case 5 :
        	details.printDetails(controller.searchParticularTask(validator.validateTaskId(details.getTaskId())));
        	break;
        case 6 :
        	taskAssigner.assignTask(validator.validateAssigneeId(details.getAssigneeId()),
        			details.getListOfTaskId());
        	break;
        case 7 :
        	details.printAllTask(controller.searchTaskByStatus(details.getTaskStatus()));
        	break;
        case 8 :
        	details.printAllTask(taskAssigner.searchTaskByAssigneeId
        			(validator.validateAssigneeId(details.getAssigneeId())));
        	break;
        case 9 :
        	menu.dispalyOptions();
        	break;
        default :
        	System.out.println ("You have entered wrong choice");
        	break;
        }
	}
}
