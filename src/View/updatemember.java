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

public class updatemember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updatemember frame = new updatemember();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Updatemember");
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
	public updatemember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		

		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 JButton updatemembtn1=new JButton("UPDATE");
			JButton updatememclear=new JButton("CLEAR");
			JButton updatememsearch=new JButton("SEARCH");
			
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
				
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
				
			    LineBorder border = new LineBorder(Color.RED, 2);
			    
			    JButton backbtn5=new JButton("Back To Home");
			    
			    JTextField umemnic=new JTextField();
			    JTextField umemname=new JTextField();
			    JTextField umemid=new JTextField();
			    JTextField umemtele=new JTextField();
			    JTextField umememail=new JTextField();
		
			    
			   
			    
			    umemnic.setSize(230,28);
			    umemnic.setLocation(290,112);
			    umemnic.setBorder(border);
			    contentPane.add( umemnic);
			    
			    umemname.setSize(230,28);
			    umemname.setLocation(290,192);
			    umemname.setBorder(border);
			    contentPane.add(umemname);
			    
			    umemid.setSize(230,28);
			    umemid.setLocation(290,272);
			    umemid.setBorder(border);
			    contentPane.add( umemid);
				
				umememail.setSize(230,28);
				umememail.setLocation(290,352);
				umememail.setBorder(border);
				 contentPane.add(umememail);
			     
			     umemtele.setSize(230,28);
			     umemtele.setLocation(290,432);
			     umemtele.setBorder(border);
			     contentPane.add(umemtele);
			     
			
			     
			     
		;	      

				

				JLabel upmem=new JLabel("UPDATE MEMBER");
				JLabel upmemnic=new JLabel("NIC");
				JLabel upmemname=new JLabel("Member Name");
				JLabel upmemberid=new JLabel("Member ID");
				JLabel upmemtele=new JLabel("Telephone");
		
				JLabel upmememail=new JLabel("Email");
				
				
				upmem.setSize(300,30); 
				upmem.setLocation(40,30);
				upmem.setFont(font3);
				 contentPane.add(upmem);
				
				upmemnic.setSize(300,30); 
				upmemnic.setLocation(100,110);
				upmemnic.setFont(font2);
				 contentPane.add(upmemnic);
				
				upmemname.setSize(300,30); 
				upmemname.setLocation(100,190);
				upmemname.setFont(font2);
				 contentPane.add(upmemname);
				
				upmemberid.setSize(300,30); 
				upmemberid.setLocation(100,270);
				upmemberid.setFont(font2);
				 contentPane.add(upmemberid);
				
				upmemtele.setSize(300,30); 
				upmemtele.setLocation(100,350);
				upmemtele.setFont(font2);
				 contentPane.add(upmemtele);
				
				upmememail.setSize(300,30); 
				upmememail.setLocation(100,430);
				upmememail.setFont(font2);
				 contentPane.add(upmememail);
				
			    updatemembtn1.setSize(180,35);
			    updatemembtn1.setLocation(100,530);
			    updatemembtn1.setBackground(myColor2);
			    updatemembtn1.setForeground(Color.WHITE);
			    contentPane.add(updatemembtn1);
		        
		        updatememclear.setSize(180,35);
		        updatememclear.setLocation(335,530);
		        updatememclear.setBackground(myColor3);
		        updatememclear.setForeground(Color.WHITE);
		        contentPane.add(updatememclear);
		        
		        updatememsearch.setSize(100,35);
		        updatememsearch.setLocation(560,112);
		        updatememsearch.setBackground(myColor2);
		        updatememsearch.setForeground(Color.WHITE);
		        contentPane.add(updatememsearch);
		        
		        backbtn5.setSize(180,35);
		        backbtn5.setLocation(10,600);
		        backbtn5.setBackground(Color.BLUE);
		        backbtn5.setForeground(Color.WHITE);
		        contentPane.add(backbtn5);
		        backbtn5.setBorder(border);
		        backbtn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Home.main(new String[] {});
						dispose();
					}
				});
	}

}
