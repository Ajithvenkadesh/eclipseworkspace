package com.taskManagementSystem.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;

/**
 * Provides method for connecting to database.
 * 
 * @author Ajithvenkadesh
 * @version 1.0
 */
public class Connector {
		
	/**
	 * Connects to the PostgreSQL database
	 * 
	 * @return connection object.
	 */
	public Connection connect() {
		final Properties properties = new Properties();
		final String propertyFileLocation = "C:\\Users\\Ajithvenkadesh\\eclipse-workspace"
				+ "\\task\\src\\main\\resources\\JDBCSettings.properties";
		//Connection connection = null; 
		    	
		try {
			final FileReader fileReader = new FileReader(propertyFileLocation);
		   	properties.load(fileReader);
		} catch (IOException e) {
			System.out.println ("Change file location");
		}
		   	
		try {
			String dbURL = properties.getProperty("db.url");
			String username = properties.getProperty("db.username");
			String password = properties.getProperty("db.password");
			return DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {		
			  System.out.println("Error Connection");
	         //  Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
	          // ex.printStackTrace();
	           return null;
		}
		
	}
}

