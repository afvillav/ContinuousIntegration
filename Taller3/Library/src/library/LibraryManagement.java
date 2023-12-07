package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LibraryManagement {
	private ArrayList<Book> books;
	private double checkout;
	
	public LibraryManagement(ArrayList<Book> books) {
		this.books=books;
		this.checkout=0;
	}
	
	public ArrayList<Book> getBooks() {
		return this.books;
	}
	
	public double getCheckout() {
		return this.checkout;
	}
	
	public void setBooks(Book book) {
		this.books.add(book);
	}
	
	public void setCheckout(double checkout) {
		this.checkout=checkout;
	}
	
	public void BorrowBook() {
		
	}
	
	public void returnBook() {
		
	}
	
	public static void main(String[] args) {
		Book cenicienta= new Book("Charles Perrault", "Cenicienta", 13);
		Book blancanieves= new Book("Hermanos Grimm", "Blancanieves y los siete enanos", 3);
		Book rapunzel= new Book("Hermanos Grimm", "Rapunzel", 7);

		ArrayList<Book> libros= new ArrayList<>();
		libros.add(cenicienta);
		libros.add(rapunzel);
		libros.add(blancanieves);
		
		LibraryManagement biblioteca = new LibraryManagement(libros);
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido a la biblioteca\n");
		System.out.println("Que desea hacer? Escoja 1 o 2\n 1.Prestar Libros\n 2.Devolver Libros");
		int opcion = sc.nextInt();
		if (opcion==1) {
			System.out.println("Estos son los libros disponibles\n");
			ArrayList<Book> books= biblioteca.getBooks();
			for (int i=0;i<books.size();i++) {
				System.out.println(i+"Titulo: "+books.get(i).getTitle()+" " +"Autor: "+ books.get(i).getAuthor());
			}
			int total=0;
			boolean var=true;
			while(var) {
				System.out.println("Escoja el numero del libro que quiera prestar, escoja 999 si ya no desea escoger mas libros\n");
				int libro=sc.nextInt();
				if(libro==999) {
					var=false;
					break;
				}
				System.out.println("Escoja la cantidad a prestar\n");
				int cantidad=sc.nextInt();
				total+=cantidad;			
				int status= books.get(libro).getQuantity();
				while (cantidad>status || cantidad<=0) {
					System.out.println("No hay suficiente inventario o ingreso una cantidad menor a 0, el inventario actual es: "+status);
					System.out.println("Escoja la cantidad a prestar\n");
					cantidad=sc.nextInt();
				}
			}
			System.out.println("Disfrute sus libros.\n");
			System.out.println("La fecha en la que tendra que devolver sus libros es: .\n");
			String input = "2023-12-07";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		    LocalDate date = LocalDate.parse(input, formatter);  
		    LocalDate newDate = date.plusDays(14);
		    String output = newDate.format(formatter);
		    System.out.println("Debe devolver sus libros en la fecha: "+ output);
		}else if (opcion==2) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
			LocalDateTime now = LocalDateTime.now();  
			System.out.println("Fecha actual: "+dtf.format(now));  
			System.out.println("Ingrese la fecha en la que presto su libro");			   
			int factura=0;
		}
	}	
}

