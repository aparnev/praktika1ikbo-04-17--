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
