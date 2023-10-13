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

public class updatebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatebook frame = new updatebook();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Home");
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
	public updatebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JButton updatebookbtn=new JButton("UPDATE");
		JButton updateclear=new JButton("CLEAR");
		JButton updatesearch=new JButton("SEARCH");
		
		JButton backbtn3=new JButton("Back To Home");
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 Font font1 = new Font("Arial", Font.BOLD, 24);
			Font font2 = new Font("Arial", Font.BOLD, 20);
			Font font3 = new Font("Times New Roman", Font.BOLD, 26);
			Font font4 = new Font("Times New Roman", Font.BOLD, 60);
			
			Color myColor1 = new Color(204,204,204);
			Color myColor2 = new Color(255,102,102);
			Color myColor3 = new Color(51,51,51);
			
			 JTextField uisbn=new JTextField();
			    JTextField uname=new JTextField();
			    JTextField uauthor=new JTextField();
			    JTextField upubli=new JTextField();
			    JTextField udes=new JTextField();
			    
			    LineBorder border = new LineBorder(Color.RED, 2);
		
			    
			
			    
			    uisbn.setSize(230,28);
			 	uisbn.setLocation(290,112);
			    uisbn.setBorder(border);
			    contentPane.add(uisbn);
			    
			    uname.setSize(230,28);
			 	uname.setLocation(290,192);
			    uname.setBorder(border);
			    contentPane.add(uname);
			    
			    uauthor.setSize(230,28);
			    uauthor.setLocation(290,272);
			    uauthor.setBorder(border);
			    contentPane.add( uauthor);
				
				 upubli.setSize(230,28);
			     upubli.setLocation(290,352);
				 upubli.setBorder(border);
				 contentPane.add(upubli);
			     
			     udes.setSize(300,70);
			     udes.setLocation(290,432);
				 udes.setBorder(border);
				 contentPane.add(udes);
			     
			
			     
			     
		;	      

				

				JLabel uaddbook=new JLabel("UPDATE BOOK");
				JLabel ubookisbn=new JLabel("Book ISBN");
				JLabel ubookname=new JLabel("Book Name");
				JLabel upauthor=new JLabel("Book Author");
				JLabel uppubli=new JLabel("Publication");
		
				JLabel updes=new JLabel("Description");
				
				
				uaddbook.setSize(300,30); 
				uaddbook.setLocation(40,30);
				uaddbook.setFont(font3);
				contentPane.add(uaddbook);
				
				ubookisbn.setSize(300,30); 
				ubookisbn.setLocation(100,110);
				ubookisbn.setFont(font2);
				contentPane.add(ubookisbn);
				
				ubookname.setSize(300,30); 
				ubookname.setLocation(100,190);
				ubookname.setFont(font2);
				contentPane.add(ubookname);
				
				upauthor.setSize(300,30); 
				upauthor.setLocation(100,270);
				upauthor.setFont(font2);
				contentPane.add(upauthor);
				
				uppubli.setSize(300,30); 
				uppubli.setLocation(100,350);
				uppubli.setFont(font2);
				contentPane.add(uppubli);
				
				updes.setSize(300,70); 
				updes.setLocation(100,430);
				updes.setFont(font2);
				contentPane.add(updes);
				
			    updatebookbtn.setSize(180,35);
		        updatebookbtn.setLocation(100,530);
		        updatebookbtn.setBackground(myColor2);
		        updatebookbtn.setForeground(Color.WHITE);
		        contentPane.add(updatebookbtn);
		        
		        
		        updateclear.setSize(180,35);
		        updateclear.setLocation(335,530);
		        updateclear.setBackground(myColor3);
		        updateclear.setForeground(Color.WHITE);
		        contentPane.add(updateclear);
		        
		        updatesearch.setSize(100,35);
		        updatesearch.setLocation(560,112);
		        updatesearch.setBackground(myColor2);
		        updatesearch.setForeground(Color.WHITE);
		        contentPane.add(updatesearch);
		        
		        backbtn3.setSize(180,35);
		        backbtn3.setLocation(10,600);
		        backbtn3.setBackground(Color.BLUE);
		        backbtn3.setForeground(Color.WHITE);
		        contentPane.add(backbtn3);
		        
		  	    backbtn3.setSize(180,35);
		        backbtn3.setLocation(10,600);
		        backbtn3.setBackground(Color.BLUE);
		        backbtn3.setForeground(Color.WHITE);
		        contentPane.add(backbtn3);
		        backbtn3.setBorder(border);
		        backbtn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
	}

}
