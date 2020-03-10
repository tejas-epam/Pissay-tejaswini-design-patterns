package patterns;

public class StruturalPttern1 {
	public static void main(String[] args) 
    { 
        Vehicle vehicle1 = new Truck(new Produce(), new Assemble()); 
        vehicle1.manufacture(); 
        Vehicle vehicle2 = new Load(new Produce(), new Assemble()); 
        vehicle2.manufacture(); 
    } 
}
	abstract class Vehicle { 
	    protected shop a; 
	    protected shop b; 
	  
	    protected Vehicle(shop a, shop b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	    } 
	  
	    abstract public void manufacture(); 
	} 
	  
	class Truck extends Vehicle { 
	    public Truck(shop a, shop b) 
	    { 
	        super(a, b); 
	    } 
	  

	    public void manufacture() 
	    { 
	        System.out.print("Truck "); 
	      a.work(); 
	        b.work(); 
	    } 
	} 
	
	class Load extends Vehicle { 
	    public Load(shop a, shop b) 
	    { 
	        super(a, b); 
	    } 
	    public void manufacture() 
	    { 
	        System.out.print("Load "); 
	        a.work(); 
	        b.work(); 
	    } 
	} 
	  
	interface shop 
	{ 
	    abstract public void work(); 
	} 
	  
	class Produce implements shop { 
	    public void work() 
	    { 
	        System.out.print("Produced"); 
	    } 
	} 
	  

	class Assemble implements shop { 
	    public void work() 
	    { 
	        System.out.print(" And"); 
	        System.out.println(" Assembled."); 
	    } 
	} 
	  
	