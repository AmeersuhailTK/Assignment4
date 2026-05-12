package typeCasting;

public class implicit_explicit {
	    public static void main(String[] args) {

	        // Implicit Casting (Widening)
	        int a = 10;
	        double b = a;   // int → double
	        System.out.println("Implicit Casting (int to double): " + b);

	        // Explicit Casting (Narrowing)
	        double x = 9.78;
	        int y = (int) x;   // double → int
	        System.out.println("Explicit Casting (double to int): " + y);

	        // Char to int (implicit)
	        char c = 'A';
	        int y1 = c;
	        System.out.println("Char to int: " + y1);

	        // int to char (explicit)
	        int num = 66;
	        char ch = (char) num;
	        System.out.println("Int to char: " + ch);
	    }
	}



