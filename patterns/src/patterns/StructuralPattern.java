package patterns;

public class StructuralPattern {
	public static void main(String args[]) 
    { 
        Parrot p = new Parrot(); 
        Lion l = new Animal(); 
        Lion a = new Adapter(p); 
  
        System.out.println("Parrot");
        p.fly(); 
        p.sound(); 
  
        System.out.println("Lion"); 
        l.roars(); 
  
        System.out.println("Adapter"); 
        a.roars(); 
    } 
} 
	  
	interface Bird
	{
	    public void fly(); 
	    public void sound(); 
	} 
	  
	 class Parrot implements Bird 
	{ 
	    public void fly() 
	    { 
	        System.out.println("Flying"); 
	    } 
	    public void sound() 
	    { 
	        System.out.println("squawks"); 
	    } 
	} 
	  
	interface Lion
	{ 
	    public void roars();
			
		} 
	
	  
	class Animal implements Lion
	{ 
	    public void roars() 
	    { 
	        System.out.println("grunts"); 
	    } 
	} 
	  
	class Adapter implements Lion
	{ 
	    Bird b; 
	    public Adapter(Bird b) 
	    { 
	        this.b = b; 
	    } 
	  
	    public void roars() 
	    { 
	        b.sound(); 
	    } 
	} 
	  
	