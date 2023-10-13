package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class viewallmember extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewallmember frame = new viewallmember();
					frame.setVisible(true);
					frame.setTitle("Viewalladdmember");
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
	public viewallmember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
		 JButton backbtn8=new JButton("Back To Home");
		 
		 LineBorder border = new LineBorder(Color.RED, 2);
		 
		  backbtn8.setSize(180,35);
	        backbtn8.setLocation(10,600);
	        backbtn8.setBackground(Color.BLUE);
	        backbtn8.setForeground(Color.WHITE);
	        contentPane.add(backbtn8);
	        backbtn8.setBorder(border);
	        backbtn8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	}

}
