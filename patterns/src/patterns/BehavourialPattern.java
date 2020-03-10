package patterns;

public class BehavourialPattern {
	public static void main(String[] args) { 
        Chain a = new Negative(); 
        Chain b= new Zero(); 
        Chain c= new Positive(); 
        a.set(b); 
        b.set(c); 
        a.process(new Number(15)); 
        a.process(new Number(-1)); 
        a.process(new Number(10)); 
        a.process(new Number(12)); 
	}
}
	interface Chain
	{ 
	    public abstract void set(Chain nextChain); 
	    public abstract void process(Number request); 
	} 
	  
	class Number 
	{ 
	     
		int number;
		public Number(int number) 
	    { 
	        this.number = number; 
	    } 
	  
	    public int get() 
	    { 
	        return number; 
	    } 
	  
	} 
	  
	class Negative implements Chain 
	{ 
	     Chain nextChain; 
	  
	    public void set(Chain c) 
	    { 
	        nextChain = c; 
	    } 
	  
	    public void process(Number request) 
	    { 
	        if (request.get() < 0) 
	        { 
	            System.out.println("Negative: " + request.get()); 
	        } 
	        else
	        { 
	            nextChain.process(request); 
	        } 
	    } 
	} 
	  
	class Zero implements Chain 
	{ 
	      
	     Chain nextChain; 
	  
	    public void set(Chain c) 
	    { 
	        nextChain = c; 
	    } 
	  
	    public void process(Number request) 
	    { 
	        if (request.get() == 0) 
	        { 
	            System.out.println("Zero : " + request.get()); 
	        } 
	        else
	        { 
	            nextChain.process(request); 
	        } 
	    } 
	} 
	  
	 class Positive implements Chain 
	{ 
	  
	     Chain nextChain; 
	  
	    public void set(Chain c1) 
	    { 
	        nextChain = c1; 
	    } 
	  
	    public void process(Number request) 
	    { 
	        if (request.get() > 0) 
	        { 
	            System.out.println("Positive : " + request.get()); 
	        } 
	        else
	        { 
	            nextChain.process(request); 
	        } 
	    } 
	} 
	  
	


