package staticNonstatic;

public class Main {

	    // Static method
	    static void staticMethod() {
	        System.out.println("This is a STATIC method.");
	    }

	    // Non-static method
	    void nonStaticMethod() {
	        System.out.println("This is a NON-STATIC method.");
	    }

	    public static void main(String[] args) {

	        // Calling static method (no object needed)
	        Main.staticMethod();

	        // Calling non-static method (object needed)
	        Main obj = new Main();
	        obj.nonStaticMethod();
	    }
	}



