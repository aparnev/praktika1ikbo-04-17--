import java.lang.*; 
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
