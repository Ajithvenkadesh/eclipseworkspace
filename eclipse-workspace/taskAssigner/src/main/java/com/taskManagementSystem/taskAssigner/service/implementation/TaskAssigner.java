package com.taskManagementSystem.taskAssigner.service.implementation;

import com.taskManagementSystem.taskAssigner.dao.TaskAssignerDao;
import com.taskManagementSystem.taskAssigner.model.Task;
import com.taskManagementSystem.taskAssigner.model.TaskAssignerModel;
import com.taskManagementSystem.taskAssigner.service.TaskAssignerService;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Assigns task to assignee and searches task 
 * assigned to assignee using assignee id.
 * 
 * @author Ajithvenkadesh
 * @version 1.0
 */
public class TaskAssigner implements TaskAssignerService {
	final TaskAssignerDao ASSIGNERDAO = new TaskAssignerDao();
	
	/**
	 * Assigns task to assignee.
	 * 
	 * @param taskAssignerModel Id of the assignee.
	 */
	@Override
	@Path("/")
	@Consumes("application/json")
	@PUT
	public void assignTask(final TaskAssignerModel taskAssignerModel) {
		ASSIGNERDAO.assignTask(taskAssignerModel.getAssigneeId(),
				taskAssignerModel.getTaskIdList());
	}
	
	/**
	 * Searches task by assignee id.
	 * 
	 * @param id Id of the assignee.
	 * @return List of task.
	 */
	@Path("/{id}")
	@Produces("application/json")
	@GET
	public ArrayList<Task> searchTaskByAssigneeId(@PathParam("id") final int id) {
		return ASSIGNERDAO.searchTaskByAssigneeId(id);
	}
}
