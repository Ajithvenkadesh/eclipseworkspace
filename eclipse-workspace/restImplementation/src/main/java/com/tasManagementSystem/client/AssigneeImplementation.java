package com.taskManagementSystem.model;

import com.taskManagementSystem.dao.AssigneeDao;
import com.taskManagementSystem.model.Assignee;
//import com.taskManagementSystem.model.AssigneeService;

/**
 * Implements the methods of assignee service class.
 * 
 * @author Ajithvenkadesh
 * @version 1.0
 */
public class AssigneeImplementation implements AssigneeService {
	final AssigneeDao ASSIGNEEDAO = new AssigneeDao();
	
	/**
	 * Calls the create assignee method in 
	 * assignee dao class.
	 * 
	 * @param assignee Object of assignee.
	 * @return Success or failure message
	 */
	public String create(final Assignee assignee) {
		return ASSIGNEEDAO.create(assignee.getAssigneeName());
	}
	
	/**
	 * Calls the delete assignee method in 
	 * assignee dao class.
	 * 
	 * @param id Id of the assignee.
	 * @return Success or failure message.
	 */
	public String delete(final int id) {
		return ASSIGNEEDAO.delete(id);
	}
	
	/**
	 * Calls the update assignee method in 
	 * assignee dao class.
	 * 
	 * @param id Id of the assignee.
	 * @param name Name of the assignee.
	 * @return Success or failure message.
	 */
	public String update(Assignee assignee) {
		return ASSIGNEEDAO.update(assignee.getAssigneeId(), 
				assignee.getAssigneeName());
	}
	
	/**
	 * Calls the create assignee method in 
	 * assignee dao class.
	 * 
	 * @param id Id of the assignee.
	 * @return Object of assignee.
	 */
	public Assignee search(int id) {
		return ASSIGNEEDAO.search(id);
	}
}
