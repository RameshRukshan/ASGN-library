package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Login extends JFrame  {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	String un = "null";
    String pas = "null";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("login");
					frame.setLayout(null);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		public Login() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 700, 700);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			
		

			setContentPane(contentPane);
			
			JLabel lbl1=new JLabel("Enter Username");
			JLabel lbl2=new JLabel("Enter Password");
			JLabel lbl3=new JLabel("LIBRARY SYSTEM");
			
			JButton btn1=new JButton("Login");
			JButton btn2=new JButton("Clear");
			
			Font font1 = new Font("Arial", Font.BOLD, 24);
			
			 LineBorder border = new LineBorder(Color.RED, 2);
			

		    JTextField usname=new JTextField();
		    JPasswordField pass=new JPasswordField();
		    
		    Font font4 = new Font("Times New Roman", Font.BOLD, 60);
		    
		    Color myColor = new Color(192, 192, 192);
		    
		    btn1.setSize(200,50);
	        btn1.setLocation(70,430);
	        btn1.setBackground(Color.BLUE);
	        btn1.setForeground(Color.WHITE);
	    	btn1.setFont(font1);
	        btn1.setBorder(border);
	        contentPane.add(btn1);
	        
	        btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					un = usname.getText();
		            pas = new String(pass.getPassword());
					
					Control.Login log = new Control.Login();
					int status = log.checkCredentials(un,pas);
					
					//-------------------------------------------------------------------
					
					try {
						FileWriter  myWriter = new FileWriter ("log.txt");
						myWriter.write("Username is : "+un+"	Password id : "+pas+"	Status is : "+status);
					    myWriter.close();
					} catch (IOException enn) {
					      System.out.println("An error occurred.");
					      enn.printStackTrace(); 
					 }
					
					//-------------------------------------------------------------------
					
					
					if(status == 1) {
						Home.main(new String[] {});
						dispose();
					}else if(status == 2){
						memberdashboard.main(new String[] {});
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Login failed. Incorrect username or password.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
	        
	        btn2.setSize(200,50);
	        btn2.setLocation(330,430);
	        btn2.setBackground(Color.BLACK);
	        btn2.setForeground(Color.WHITE);
	    	btn2.setFont(font1);
	        btn2.setBorder(border);
	        contentPane.add(btn2);
	        
	        
		    usname.setSize(250,40);
			usname.setLocation(280,150);
		    usname.setBorder(border);
			
			contentPane.add(usname);
			
		    pass.setSize(250,40);
		    pass.setLocation(280,250);
		    pass.setBorder(border);
				
		    contentPane.add(pass);
				
			lbl1.setSize(700,300); 
			lbl1.setLocation(70,150);
			lbl1.setFont(font1);
			
			lbl3.setSize(600,50); 
			lbl3.setLocation(50,20);
			lbl3.setFont(font4);
			lbl3.setForeground(Color.RED);
			contentPane.add(lbl3);
			
		
			contentPane.add(lbl1);
			contentPane.setBackground(myColor);
			lbl1.setSize(300,30); 
		    
			contentPane.add(lbl2);
			
			lbl2.setSize(300,30); 
			lbl2.setLocation(70,250);
			lbl2.setFont(font1);
			
			contentPane.add(lbl2);
	        

			
		    
	}
	
	
	

}
