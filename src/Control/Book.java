package Control;

public class Book {
	
	public void addBook(String isbn, String name, String author,String cat,String pub, String des, String sta) {
		Model.Book b = new Model.Book();
		b.addBook(isbn, name, author, cat, pub, des, sta);
	}
	
	public void issueBook(String isbn, String nic, String dDate) {
		Model.Book b = new Model.Book();
		b.issueBook(isbn, nic, dDate);
	}
	
	public void returnBook(String isbn) {
		Model.Book b = new Model.Book();
		b.returnBook(isbn);
	}
}
