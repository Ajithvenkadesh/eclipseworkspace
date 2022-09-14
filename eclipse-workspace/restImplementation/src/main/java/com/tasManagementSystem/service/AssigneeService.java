package com.taskManagementSystem.model;

/**
 * Lists the services available for assignee.
 *  
 * @author Ajith venkadesh
 * @version 1.0
 */
public interface AssigneeService {
	
	/**
	 * Creates new assignee by getting inputs from user.
	 * 
	 * @param assignee Object of assignee class.
	 */
	public String create(final Assignee assignee);
			
	/**
	 * Deletes a particular assignee by using assignee id.
	 * 
	 * @param id Id of the assignee.
	 */
	public String delete(final int id);
	
	/**
	 * Updates a particular assignee by using assignee id.
	 * 
	 * @param assignee object of assignee.
	 */
	public String update(final Assignee assignee);
	
	/**
	 * Searches a particular assignee by using assignee id.
	 * 
	 * @param id Id of the assignee.
	 * @return Required assignee record.
	 */
	public 	Assignee search(final int id);
}
