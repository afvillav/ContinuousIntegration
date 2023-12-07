package library;

public class Book {
	private String title;
	private String author;
	private boolean status;
	private int quantity;
	
	public Book (String autor, String titulo, int quantity) {
		this.author=autor;
		this.title=titulo;
		this.status=true;
		this.quantity=quantity;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public Boolean getStatus() {
		return this.status;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setTitle(String titulo) {
		this.title=titulo;
	}
	
	public void setAuthor(String autor) {
		this.author=autor;
	}
	
	public void setStatus(boolean status) {
		this.status=status;
	}
	
	public void setQuantity(int q) {
		this.quantity=q;
	}
	
	public String toString() {
	    return "Book: Author = " + this.author + "; title = " + this.title ;
	}
	
}