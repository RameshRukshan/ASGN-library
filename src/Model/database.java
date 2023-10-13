package Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class database {
	
	Connection connection;
	
	public void createConnection() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/asgnlibrary";
	    String dbUsername = "root";
	    String dbPassword = "";

	    try {

	        connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Database connection error.");
	    }
	}
	
	public Connection conn() {
		return connection;
	}
}
