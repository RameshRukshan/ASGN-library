package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Member {
	public void addMembers(String nic, String name, String tel, String email, String username, String pass) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			String sql = "INSERT INTO member (name,nic,tel,email,username,password) VALUES (?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, name);
	        preparedStatement.setString(2, nic);
	        preparedStatement.setString(3, tel);
	        preparedStatement.setString(4, email);
	        preparedStatement.setString(5, username);
	        preparedStatement.setString(6, pass);
	        
	        int rowsAffected = preparedStatement.executeUpdate();

	        if (rowsAffected > 0) {
	            JOptionPane.showMessageDialog(null, "Member added successfully.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Failed to add the Member.");
	        }

	        String access = "u";
	        String sqlu = "INSERT INTO users (username,password,access) VALUES (?,?,?)";
			
			PreparedStatement preparedStatementu = con.prepareStatement(sqlu);
			preparedStatementu.setString(1, username);
	        preparedStatementu.setString(2, pass);
	        preparedStatementu.setString(3, access);
	        
	        int rowsAffectedu = preparedStatementu.executeUpdate();

	        if (rowsAffectedu > 0) {
	            JOptionPane.showMessageDialog(null, "Member added successfully.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Failed to add the Member.");
	        }
	        
	        preparedStatementu.close();
	        preparedStatement.close();
	        con.close();
		}catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public void updateMember(String name,String email, String tel,String nic) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			
			String sql = "update member set name = ?,tel = ?,email = ?  where nic = ?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, tel);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, nic);
            
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                
                JOptionPane.showMessageDialog(null, "Member updated successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error updating member.");
            }
            
            preparedStatement.close();
            con.close();
		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public ResultSet viewMember() {
		ResultSet resultSet = null;
	    Connection con = null;
	    Statement statement = null;

	    try {
	        database d = new database();
	        d.createConnection();
	        con = d.conn();

	        statement = con.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM member");

	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error executing SQL query: " + e.getMessage());
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error establishing database: " + e.getMessage());
	    } finally {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (statement != null) {
	                statement.close();
	            }
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return resultSet;
	}
	
}
