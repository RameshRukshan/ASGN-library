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

public class viewallissuebook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewallissuebook frame = new viewallissuebook();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Viewaissuebook");
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
	public viewallissuebook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		 Color myColor = new Color(192, 192, 192);
		 contentPane.setBackground(myColor);
		 
 JButton backbtn7=new JButton("Back To Home");
		 
		 LineBorder border = new LineBorder(Color.RED, 2);
		 
		  backbtn7.setSize(180,35);
	        backbtn7.setLocation(10,600);
	        backbtn7.setBackground(Color.BLUE);
	        backbtn7.setForeground(Color.WHITE);
	        contentPane.add(backbtn7);
	        backbtn7.setBorder(border);
	        backbtn7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	}

}
