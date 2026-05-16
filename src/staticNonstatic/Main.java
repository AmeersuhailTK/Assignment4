package staticNonstatic;

public class Main {
	    public static void main(String[] args) {

	        // Calling static method (no object needed)
	        subClass.staticMethod();

	        // Calling non-static method (object needed)
	        subClass name = new subClass();
	        name.nonStatic();
	    }
	}



