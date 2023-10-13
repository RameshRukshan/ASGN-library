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

import Control.Book;

public class issuebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issuebook frame = new issuebook();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("IssueBook");
					frame.setLayout(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public issuebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 JTextField iisbn=new JTextField();
		    JTextField iname=new JTextField();
		    JTextField imembid=new JTextField();
		    JTextField iissudate=new JTextField();
		    JTextField iduedate=new JTextField();
	
		    
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
				JButton backbtn1=new JButton("Back To Home");
				
				 LineBorder border = new LineBorder(Color.RED, 2);
				 
				 JButton issuebookbtn=new JButton("ISSUE");
					JButton issueclear=new JButton("CLEAR");
					JButton issuesearch=new JButton("SEARCH");
					
					 Font font1 = new Font("Arial", Font.BOLD, 24);
						Font font2 = new Font("Arial", Font.BOLD, 20);
						Font font3 = new Font("Times New Roman", Font.BOLD, 26);
						Font font4 = new Font("Times New Roman", Font.BOLD, 60);
						
						Color myColor1 = new Color(204,204,204);
						Color myColor2 = new Color(255,102,102);
						Color myColor3 = new Color(51,51,51);
			 
			 
		    
		    iisbn.setSize(230,28);
		 	iisbn.setLocation(290,112);
		    iisbn.setBorder(border);
		    contentPane.add(iisbn);
		    
		    iname.setSize(230,28);
		 	iname.setLocation(290,192);
		    iname.setBorder(border);
		    contentPane.add(iname);
		    
		    imembid.setSize(230,28);
		    imembid.setLocation(290,272);
		    imembid.setBorder(border);
		    contentPane.add(imembid);
			
			iissudate.setSize(230,28);
			iissudate.setLocation(290,352);
			iissudate.setBorder(border);
			 contentPane.add(iissudate);
		     
		     iduedate.setSize(230,28);
		     iduedate.setLocation(290,432);
		     iduedate.setBorder(border);
		     contentPane.add(iduedate);
		     
		
		     
		     
	;	      

			

			JLabel iaddbook=new JLabel("ISSUE BOOK");
			JLabel ibookisbn=new JLabel("Book ISBN");
			JLabel ibookname=new JLabel("Book Name");
			JLabel imemberid=new JLabel("Member ID");
			JLabel iidate=new JLabel("Issue Date");
	
			JLabel iddate=new JLabel("Due Date");
			
			
			iaddbook.setSize(300,30); 
			iaddbook.setLocation(40,30);
			iaddbook.setFont(font3);
			 contentPane.add(iaddbook);
			
			ibookisbn.setSize(300,30); 
			ibookisbn.setLocation(100,110);
			ibookisbn.setFont(font2);
			 contentPane.add(ibookisbn);
			
			ibookname.setSize(300,30); 
			ibookname.setLocation(100,190);
			ibookname.setFont(font2);
			 contentPane.add(ibookname);
			
			imemberid.setSize(300,30); 
			imemberid.setLocation(100,270);
			imemberid.setFont(font2);
			 contentPane.add(imemberid);
			
			iidate.setSize(300,30); 
			iidate.setLocation(100,350);
			iidate.setFont(font2);
			 contentPane.add(iidate);
			
			iddate.setSize(300,30); 
			iddate.setLocation(100,430);
			iddate.setFont(font2);
			 contentPane.add(iddate);
			
		    issuebookbtn.setSize(180,35);
	        issuebookbtn.setLocation(100,530);
	        issuebookbtn.setBackground(myColor2);
	        issuebookbtn.setForeground(Color.WHITE);
	        contentPane.add(issuebookbtn);
	        
	        issueclear.setSize(180,35);
	        issueclear.setLocation(335,530);
	        issueclear.setBackground(myColor3);
	        issueclear.setForeground(Color.WHITE);
	        contentPane.add(issueclear);
	        
	        issuesearch.setSize(100,35);
	        issuesearch.setLocation(560,112);
	        issuesearch.setBackground(myColor2);
	        issuesearch.setForeground(Color.WHITE);
	        contentPane.add(issuesearch);
	        

	        backbtn1.setSize(180,35);
	        backbtn1.setLocation(10,600);
	        backbtn1.setBackground(Color.BLUE);
	        backbtn1.setForeground(Color.WHITE);
	        contentPane.add(backbtn1);
	    
	        backbtn1.setBorder(border);
	        backbtn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	        
	        issuebookbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Book b= new Book();
					b.issueBook(iisbn.getText(), imembid.getText(), iduedate.getText());
				}
			});
	}

}
