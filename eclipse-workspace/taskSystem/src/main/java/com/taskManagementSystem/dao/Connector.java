package com.taskManagementSystem.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import com.taskManagementSystem.view.MenuLauncher;
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
		try {
			//	String dbURL = "postgresql://localhost:5432/sql";
			//	String username = "c";
			//	String password = "123";
				try {
					Class.forName("org.postgresql.Driver");
				} catch (ClassNotFoundException e) {
					throw new RuntimeException(e);
				}
			String dbURL = "jdbc:postgresql:sql?user=postgres&password=123";
			return DriverManager.getConnection(dbURL);
			//return DriverManager.getConnection(dbURL, username, password);
			} catch (SQLException e) {
				System.out.println ("Change the url or db user name or db password"
						+ "in properties file");
				return null;
			}

		}
}

