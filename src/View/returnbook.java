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

public class returnbook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbook frame = new returnbook();
					frame.setVisible(true);
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
	public returnbook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 JTextField risbn=new JTextField();
		    JTextField rname=new JTextField();
		    JTextField rid=new JTextField();
		    JTextField reidate=new JTextField();
		    JTextField reddate=new JTextField();
		    JTextField rerdate=new JTextField();
		    
			JButton backbtn2=new JButton("Back To Home");
	
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
			 LineBorder border = new LineBorder(Color.RED, 2);
			 
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
				JButton returnbookbtn=new JButton("RETURN");
				JButton returnclear=new JButton("CLEAR");
				JButton returnsearch=new JButton("SEARCH");
				
		    
		    risbn.setSize(230,28);
		 	risbn.setLocation(290,142);
		    risbn.setBorder(border);
		    contentPane.add(risbn);
		    
		    rname.setSize(230,28);
		 	rname.setLocation(290,202);
		    rname.setBorder(border);
		    contentPane.add(rname);
		    
		    rid.setSize(230,28);
			rid.setLocation(290,262);
		    rid.setBorder(border);
		    contentPane.add(rid);
			
			 reidate.setSize(230,28);
		     reidate.setLocation(290,322);
			 reidate.setBorder(border);
			 contentPane.add(reidate);
		     
		     reddate.setSize(230,28);
		     reddate.setLocation(290,382);
			 reddate.setBorder(border);
			 contentPane.add(reddate);
		     
		     rerdate.setSize(230,28);
		     rerdate.setLocation(290,442);
			 rerdate.setBorder(border);
			 contentPane.add(rerdate);
		     
		
		     
		     
	;	      

			

			JLabel raddbook=new JLabel("RETURN BOOK");
			JLabel rbookisbn=new JLabel("Book ISBN");
			JLabel rbookname=new JLabel("Book Name");
			JLabel rmemberid=new JLabel("Member ID");
			JLabel ridate=new JLabel("Issue Date");
	
			JLabel rddate=new JLabel("Due Date");
			JLabel rrdate=new JLabel("Return Date");
			
			raddbook.setSize(300,30); 
			raddbook.setLocation(40,30);
			raddbook.setFont(font3);
			contentPane.add(raddbook);
			
			rbookisbn.setSize(300,30); 
			rbookisbn.setLocation(100,138);
			rbookisbn.setFont(font2);
			contentPane.add(rbookisbn);
			
			rbookname.setSize(300,30); 
			rbookname.setLocation(100,198);
			rbookname.setFont(font2);
			contentPane.add(rbookname);
			
			rmemberid.setSize(300,30); 
			rmemberid.setLocation(100,258);
			rmemberid.setFont(font2);
			contentPane.add(rmemberid);
			
			ridate.setSize(300,30); 
			ridate.setLocation(100,318);
			ridate.setFont(font2);
			contentPane.add(ridate);
			
			rddate.setSize(300,30); 
			rddate.setLocation(100,378);
			rddate.setFont(font2);
			contentPane.add(rddate);
			
			rrdate.setSize(300,30); 
			rrdate.setLocation(100,442);
			rrdate.setFont(font2);
			contentPane.add(rrdate);
			
		    returnbookbtn.setSize(180,35);
		    returnbookbtn.setLocation(100,530);
		    returnbookbtn.setBackground(myColor2);
		    returnbookbtn.setForeground(Color.WHITE);
		    contentPane.add(returnbookbtn);
	        
	        returnclear.setSize(180,35);
	        returnclear.setLocation(335,530);
	        returnclear.setBackground(myColor3);
	        returnclear.setForeground(Color.WHITE);
	        contentPane.add( returnclear);
	        
	        returnsearch.setSize(100,35);
	        returnsearch.setLocation(560,137);
	        returnsearch.setBackground(myColor2);
	        returnsearch.setForeground(Color.WHITE);
	        contentPane.add(returnsearch);
	        
	    	
	        backbtn2.setSize(180,35);
	        backbtn2.setLocation(10,600);
	        backbtn2.setBackground(Color.BLUE);
	        backbtn2.setForeground(Color.WHITE);
	        contentPane.add(backbtn2);
	        
	        backbtn2.setBorder(border);
	        backbtn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	    returnbookbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Book  b = new Book();
				b.returnBook(rid.getText());
			}
		});
	}

}
