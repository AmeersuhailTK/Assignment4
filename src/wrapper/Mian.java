package wrapper;

public class Mian {
	
	    public static void main(String[] args) {

	    	int num = 1000;
	    	
	    	System.out.println("THeory of WRAPPER CLASS");
	        System.out.println("------------------------");
	        System.out.println("Wrapper classes in Java are object representations of primitive data types");
	        System.out.println("EXAMPLES");
	        System.out.println("int    >> Integer");
	        System.out.println("double >> Double");
	        System.out.println("char   >> Charector");
	        System.out.println("-------000------------");
	        
	        // Primitive to Wrapper (Boxing)
	        Integer obj = Integer.valueOf(num);

	        // Wrapper to Primitive (Unboxing)
	        int value = obj.intValue();

	        System.out.println("Primitive int: " + num);
	        System.out.println("Integer object: " + obj);
	        System.out.println("Back to primitive: " + value);System.out.println("Back to primitive: " + value);
	        
	        
	    }
	}

     

