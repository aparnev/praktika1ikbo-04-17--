import java.lang.*; 
public class Nursery {     
	public static void main(String[] args) {         
		Ball b1 = new Ball("Ball", 100);         
		Ball b2 = new Ball("Ball2");
		b2.setDiam(110);         
		System.out.println(b1);   
		System.out.println(b2); 
		
		Book book1 = new Book("Harry Potter", 300, "J.K. Roaling");
		Book book2 = new Book();
		book2.setName("War and Peace");
		book2.setPages(1000);
		book2.setAuthor("Tolstoi");
		System.out.println(book1);   
		System.out.println(book2); 
	} 
} 