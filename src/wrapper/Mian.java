package wrapper;

public class Mian {
	
	    public static void main(String[] args) {

	        int num = 50;

	        // Primitive to Wrapper (Boxing)
	        Integer obj = Integer.valueOf(num);

	        // Wrapper to Primitive (Unboxing)
	        int value = obj.intValue();

	        System.out.println("Primitive int: " + num);
	        System.out.println("Integer object: " + obj);
	        System.out.println("Back to primitive: " + value);
	    }
	}



