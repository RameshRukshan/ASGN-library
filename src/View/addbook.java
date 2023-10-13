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

public class addbook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addbook frame = new addbook();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setTitle("Home");
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
	public addbook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		 JTextField isbn=new JTextField();
		    JTextField name=new JTextField();
		    JTextField author=new JTextField();
		    JTextField cate=new JTextField();
		    JTextField publi=new JTextField();
		    JTextField qty=new JTextField();
		    JTextField des=new JTextField();
		    
		    JButton addbookbtn=new JButton("ADD");
			JButton addclear=new JButton("CLEAR");
			JButton addsearch=new JButton("SEARCH");
			
			 LineBorder border = new LineBorder(Color.RED, 2);
			 
			JButton backbtn=new JButton("Back To Home");
			
			
			 
			 Color myColor = new Color(192, 192, 192);
			 contentPane.setBackground(myColor);
			 
			
				Color myColor1 = new Color(204,204,204);
				Color myColor2 = new Color(255,102,102);
				Color myColor3 = new Color(51,51,51);
			 
			 Font font1 = new Font("Arial", Font.BOLD, 24);
				Font font2 = new Font("Arial", Font.BOLD, 20);
				Font font3 = new Font("Times New Roman", Font.BOLD, 26);
				Font font4 = new Font("Times New Roman", Font.BOLD, 60);
		    
		    isbn.setSize(230,28);
		 	isbn.setLocation(290,112);
		    isbn.setBorder(border);
		    contentPane.add(isbn);
		    
		    name.setSize(230,28);
		 	name.setLocation(290,162);
		    name.setBorder(border);
		    contentPane.add(name);
		    
		    author.setSize(230,28);
			author.setLocation(290,212);
		    author.setBorder(border);
		    contentPane.add(author);
			
			 cate.setSize(230,28);
		     cate.setLocation(290,262);
			 cate.setBorder(border);
			 contentPane.add(cate);
		     
		     publi.setSize(230,28);
		     publi.setLocation(290,312);
			 publi.setBorder(border);
			 contentPane.add(publi);
		     
		     qty.setSize(230,28);
		     qty.setLocation(290,362);
			 qty.setBorder(border);
			 contentPane.add(qty);
		     
		     des.setSize(230,100);
		     des.setLocation(290,412);
			 des.setBorder(border);
			 contentPane.add(des);
		     
		     
	;	      

			

			JLabel addbook=new JLabel("ADD BOOK");
			JLabel bookisbn=new JLabel("Book ISBN");
			JLabel bookname=new JLabel("Book Name");
			JLabel bookauthor=new JLabel("Book Author");
			JLabel bookcategory=new JLabel("Category");
			JLabel bookpublication=new JLabel("Publication");
			JLabel quantity=new JLabel("Quantity");
			JLabel description=new JLabel("Description");
			
			
			
			addbook.setSize(300,30); 
			addbook.setLocation(40,30);
			addbook.setFont(font3);
			contentPane.add(addbook);
			
			bookisbn.setSize(300,30); 
			bookisbn.setLocation(100,110);
			bookisbn.setFont(font2);
			contentPane.add(bookisbn);
			
			bookname.setSize(300,30); 
			bookname.setLocation(100,160);
			bookname.setFont(font2);
			contentPane.add(bookname);
			
			bookauthor.setSize(300,30); 
			bookauthor.setLocation(100,210);
			bookauthor.setFont(font2);
			contentPane.add(bookauthor);
			
			bookcategory.setSize(300,30); 
			bookcategory.setLocation(100,260);
			bookcategory.setFont(font2);
			contentPane.add(bookcategory);
			
			bookpublication.setSize(300,30); 
			bookpublication.setLocation(100,310);
			bookpublication.setFont(font2);
			contentPane.add(bookpublication);
			
			quantity.setSize(300,30); 
			quantity.setLocation(100,360);
			quantity.setFont(font2);
			contentPane.add(quantity);
			
			description.setSize(300,30); 
			description.setLocation(100,410);
			description.setFont(font2);
			contentPane.add(description);
			
		    addbookbtn.setSize(180,35);
	        addbookbtn.setLocation(100,530);
	        addbookbtn.setBackground(myColor2);
	        addbookbtn.setForeground(Color.WHITE);
	        contentPane.add(addbookbtn);
	        
	        addclear.setSize(180,35);
	        addclear.setLocation(335,530);
	        addclear.setBackground(myColor3);
	        addclear.setForeground(Color.WHITE);
	        contentPane.add(addclear);
	        
	        addsearch.setSize(100,35);
	        addsearch.setLocation(560,112);
	        addsearch.setBackground(myColor2);
	        addsearch.setForeground(Color.WHITE);
	        contentPane.add(addsearch);
	        
	        backbtn.setSize(180,35);
	        backbtn.setLocation(10,600);
	        backbtn.setBackground(Color.BLUE);
	        backbtn.setForeground(Color.WHITE);
	        contentPane.add(backbtn);
	    
	        backbtn.setBorder(border);
	        backbtn.setBorder(border);
	        
	        addbookbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//int qty = Integer.parseInt(quantity.getText());
					
					Book b = new Book();
					b.addBook(isbn.getText(),name.getText(),author.getText(),cate.getText(),publi.getText(),des.getText(),"in");
					
				}
			});
	        
	        backbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Home.main(new String[] {});
					dispose();
				}
			});
	}

}
