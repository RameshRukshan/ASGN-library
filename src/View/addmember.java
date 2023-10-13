package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Control.Member;

public class addmember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addmember frame = new addmember();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("addmember");
					frame.setLayout(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addmember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 JButton addmembtn1=new JButton("ADD");
			JButton addmemclear=new JButton("CLEAR");
			JButton addmemsearch=new JButton("SEARCH");
			
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
			    LineBorder border = new LineBorder(Color.RED, 2);
			    
			    JButton backbtn4=new JButton("Back To Home");
			
		
		   JTextField addmemnic=new JTextField();
		    JTextField addmemname=new JTextField();
		    JTextField addmemid=new JTextField();
		    JTextField addmemusername=new JTextField();
		    JTextField addmempass=new JTextField();
		    JTextField addmemtele=new JTextField();
		    JTextField addmememail=new JTextField();
		    
		    addmemnic.setSize(230,28);
		    addmemnic.setLocation(290,112);
		    addmemnic.setBorder(border);
		    contentPane.add(addmemnic);
		    
		    addmemname.setSize(230,28);
		 	addmemname.setLocation(290,162);
		    addmemname.setBorder(border);
		    contentPane.add(addmemname);
		    
		    addmemid.setSize(230,28);
			addmemid.setLocation(290,212);
		    addmemid.setBorder(border);
		    contentPane.add(addmemid);
			
			addmemusername.setSize(230,28);
			addmemusername.setLocation(290,262);
			addmemusername.setBorder(border);
			 contentPane.add(addmemusername);
		     
		     addmempass.setSize(230,28);
		     addmempass.setLocation(290,312);
		     addmempass.setBorder(border);
		     contentPane.add(addmempass);
		     
		     addmemtele.setSize(230,28);
		     addmemtele.setLocation(290,362);
		     addmemtele.setBorder(border);
		     contentPane.add( addmemtele);
		     
		     addmememail.setSize(230,100);
		     addmememail.setLocation(290,412);
		     addmememail.setBorder(border);
		     contentPane.add(addmememail);
		     
		     
	;	      

			

			JLabel addmember=new JLabel("ADD MEMBER");
			JLabel addmembernic=new JLabel("Member Nic");
			JLabel addmembername=new JLabel("Member Name");
			JLabel addmemberid=new JLabel("Member ID");
			JLabel addmemberusname=new JLabel("Username");
			JLabel addmemberpass=new JLabel("Password");
			JLabel addmembertele=new JLabel("Telephone");
			JLabel addmemberemail=new JLabel("Email");
			
			
			
			addmember.setSize(300,30); 
			addmember.setLocation(40,30);
			addmember.setFont(font3);
			 contentPane.add(addmember);
			
			addmembernic.setSize(300,30); 
			addmembernic.setLocation(100,110);
			addmembernic.setFont(font2);
			 contentPane.add(addmembernic);
			
			addmembername.setSize(300,30); 
			addmembername.setLocation(100,160);
			addmembername.setFont(font2);
			 contentPane.add(addmembername);
			
			addmemberid.setSize(300,30); 
			addmemberid.setLocation(100,210);
			addmemberid.setFont(font2);
			 contentPane.add(addmemberid);
			
			 addmemberusname.setSize(300,30); 
			 addmemberusname.setLocation(100,260);
			 addmemberusname.setFont(font2);
			 contentPane.add( addmemberusname);
			
			 addmemberpass.setSize(300,30); 
			 addmemberpass.setLocation(100,310);
			 addmemberpass.setFont(font2);
			 contentPane.add( addmemberpass);
			
			addmembertele.setSize(300,30); 
			addmembertele.setLocation(100,360);
			addmembertele.setFont(font2);
			 contentPane.add(addmembertele);
			
			 addmemberemail.setSize(300,30); 
			 addmemberemail.setLocation(100,410);
			 addmemberemail.setFont(font2);
			 contentPane.add( addmemberemail);
			
		    addmembtn1.setSize(180,35);
	        addmembtn1.setLocation(100,530);
	        addmembtn1.setBackground(myColor2);
	        addmembtn1.setForeground(Color.WHITE);
	        contentPane.add(addmembtn1);
	        
	        addmemclear.setSize(180,35);
	        addmemclear.setLocation(335,530);
	        addmemclear.setBackground(myColor3);
	        addmemclear.setForeground(Color.WHITE);
	        contentPane.add(addmemclear);
	        
	        addmemsearch.setSize(100,35);
	        addmemsearch.setLocation(560,112);
	        addmemsearch.setBackground(myColor2);
	        addmemsearch.setForeground(Color.WHITE);
	        contentPane.add(addmemsearch);
	        
	        backbtn4.setSize(180,35);
	        backbtn4.setLocation(10,600);
	        backbtn4.setBackground(Color.BLUE);
	        backbtn4.setForeground(Color.WHITE);
	        contentPane.add(backbtn4);
	        
	    
			 
			  backbtn4.setSize(180,35);
		        backbtn4.setLocation(10,600);
		        backbtn4.setBackground(Color.BLUE);
		        backbtn4.setForeground(Color.WHITE);
		        contentPane.add(backbtn4);
		        backbtn4.setBorder(border);
		        backbtn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
		        
		        addmembtn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Member m = new Member();
						m.addMember(addmemnic.getText(), addmemname.getText(), addmemtele.getText(), addmememail.getText(), addmemusername.getText(), addmempass.getText());
						
					}
				});
	}

}
