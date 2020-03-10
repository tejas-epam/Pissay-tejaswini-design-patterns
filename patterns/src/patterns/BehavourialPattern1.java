package patterns;

public class BehavourialPattern1 {
	public static void main(String[] args)  
    { 
        Alert A = new Alert(); 
        A.alert(); 
        A.alert(); 
        A.set(new Silent()); 
        A.alert(); 
        A.alert(); 
    } 
}
	interface MobileAlert 
	{ 
	    public void alert(Alert a); 
	} 
	  
	class Alert
	{ 
	    private MobileAlert currentState; 
	  
	    public Alert()  
	    { 
	        currentState = new Vibration(); 
	    } 
	  
	    public void set(MobileAlert ma)  
	    { 
	        currentState = ma; 
	    } 
	  
	    public void alert()  
	    { 
	        currentState.alert(this); 
	    } 
	} 
	  
	class Vibration implements MobileAlert
	{ 
	    
	    public void alert(Alert a)  
	    { 
	         System.out.println("vibration"); 
	    } 
	  
	} 
	  
	class Silent implements MobileAlert
	{ 
	   
	    public void alert(Alert a)  
	    { 
	        System.out.println("silent"); 
	    } 
	  
	} 
	  
	

