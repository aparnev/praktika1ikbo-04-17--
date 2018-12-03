import java.lang.*; 

public class Ball {    
	private String name; 	
    private int diameter; 
    
    public Ball(String n, int d){         
    	name = n;         
    	diameter = d;     
    } 
    
    public Ball(){         
    	name = "Ball 1";         
    	diameter = 100;     
    }
    
    public void setDiam(int diameter) {         
    	this.diameter = diameter;     
    }
    
    public void setName(String name) {         
    	this.name = name;     
    }
    
    public String getName(){         
    	return name;     
    }
    
    public int getDiam() {         
    	return diameter;     
    } 
    
    public String toString(){         
    	return "Name: " + this.name + ", diameter: " + this.diameter;     
    } 
} 

public class Book {    
	private String name; 	
    private int pages; 
    private String author; 
    
    public Book(String n, int p, String a){         
    	name = n;         
    	pages = p;
    	author = a;
    } 
    
    public Book(){         
    	name = "Book 1";         
    	pages = 300;
    	author = "Pushkin";
    }
    
    public void setPages(int pages) {         
    	this.pages = pages;     
    }
    
    public void setName(String name) {         
    	this.name = name;     
    }
    
    public void setAuthor(String author) {         
    	this.author = author;     
    }
    
    public String getName(){         
    	return name;     
    }
    
    public String getAuthor(){         
    	return author;     
    }
    
    public int getPages() {         
    	return pages;     
    } 
    
    public String toString(){         
    	return "Name: " + this.name + ", Pages: "+this.pages + ", Author: " + this.author;     
    } 
} 

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
