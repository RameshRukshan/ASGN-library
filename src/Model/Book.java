package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Model.database;

public class Book {
	public void addBook(String isbn, String name, String author,String cat,String pub, String des, String sta) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			
			String sql = "INSERT INTO book (isbn,name,author,category,publication,quantity,description,status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, isbn);
	        preparedStatement.setString(2, name);
	        preparedStatement.setString(3, author);
	        preparedStatement.setString(4, cat);
	        preparedStatement.setString(5, pub);
	        
	        //int qty = Integer.parseInt(quantity);
	        
	        preparedStatement.setInt(6, 1);
	        preparedStatement.setString(7, des);
	        preparedStatement.setString(8, sta);
	        
	        int rowsAffected = preparedStatement.executeUpdate();

	        
	        if (rowsAffected > 0) {
	            JOptionPane.showMessageDialog(null, "Book added successfully.");
	        } else {
	            JOptionPane.showMessageDialog(null, "Failed to add the book.");
	        }

	      
	        preparedStatement.close();
	        con.close();
		}catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public void issueBook(String isbn, String nic, String dDate) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			
			String sql = "INSERT INTO bookborrowing (nic,isbn,duedate,status) VALUES (?,?,?,'issued')";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, nic);
            preparedStatement.setString(2, isbn);
            preparedStatement.setString(3, dDate);
            
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
               
                JOptionPane.showMessageDialog(null, "Book issuance recorded successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error recording book issuance.");
            }
            
            String sqlu = "update book set status = ? where isbn = ?";
            PreparedStatement preparedStatementu = con.prepareStatement(sqlu);
            preparedStatementu.setString(1, "out");
            preparedStatementu.setString(2, isbn);
            
            int rowsAffectedu = preparedStatementu.executeUpdate();

            if (rowsAffectedu > 0) {
               
                JOptionPane.showMessageDialog(null, "Book updated successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error updating book issuance.");
            }
           
            preparedStatement.close();
            preparedStatementu.close();
            con.close();
		}catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public void returnBook(String isbn) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			
			String sql = "update bookborrowing set status = ? where isbn = ?";
			
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, "return");
			preparedStatement.setString(2, isbn);
			
			int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
               
                JOptionPane.showMessageDialog(null, "Book return recorded successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error recording book return.");
            }
            
            String sqlu = "update book set status = ? where isbn = ?";
            PreparedStatement preparedStatementu = con.prepareStatement(sqlu);
            preparedStatementu.setString(1, "in");
            preparedStatementu.setString(2, isbn);
            
            int rowsAffectedu = preparedStatementu.executeUpdate();

            if (rowsAffectedu > 0) {
               
                JOptionPane.showMessageDialog(null, "Book updated successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error updating book.");
            }
           
            preparedStatement.close();
            preparedStatementu.close();
            con.close();
		}catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public void updateBook(String name, String author, String cat, String pub,String des, String isbn) {
		try {
			database d = new database();
			d.createConnection();
			Connection con = d.conn();
			
			String sql = "update book set name = ?,author = ?,category = ?, publication = ?,description = ?  where isbn = ?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, cat);
            preparedStatement.setString(4, pub);
            preparedStatement.setString(5, des);
            preparedStatement.setString(6, isbn);
            
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                
                JOptionPane.showMessageDialog(null, "Book issuance recorded successfully.");

            } else {
              
                JOptionPane.showMessageDialog(null, "Error recording book issuance.");
            }
            
            preparedStatement.close();
            con.close();
		}catch(Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error establishing database.");
		}
	}
	
	public ResultSet viewBook() {
		
		ResultSet resultSet = null;
	    Connection con = null;
	    Statement statement = null;

	    try {
	        database d = new database();
	        d.createConnection();
	        con = d.conn();

	        statement = con.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM book");

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
	
	public ResultSet viewReturnBook() {
		
		ResultSet resultSet = null;
	    Connection con = null;
	    Statement statement = null;

	    try {
	        database d = new database();
	        d.createConnection();
	        con = d.conn();

	        statement = con.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM bookborrowing where ststus='returned'");

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
	
	public ResultSet viewIssuedBook() {
		
		ResultSet resultSet = null;
	    Connection con = null;
	    Statement statement = null;

	    try {
	        database d = new database();
	        d.createConnection();
	        con = d.conn();

	        statement = con.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM bookborrowing where ststus='issued'");

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
