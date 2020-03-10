package patterns;

public class CreationalPattern {
	    private static CreationalPattern obj; 
	  
	    private CreationalPattern() {} 
	  
	    public static CreationalPattern getInstance() 
	    { 
	        if (obj==null) 
	            obj = new CreationalPattern(); 
	        return obj; 
	    } 
	} 
//singleton pattern
