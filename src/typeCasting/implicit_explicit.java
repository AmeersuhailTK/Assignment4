package typeCasting;

public class implicit_explicit {
	public static void main(String[] args) {

        // Implicit Casting 
        int a = 10;
        double b = a;   // int → double
        System.out.println("implicit : "+b);

        // Explicit Casting (Narrowing)
        double x = a;
        int y = (int) x;   // double → int
        System.out.println("Explicit : " + y);
        
        
     // int to char (explicit)
        int n = 66;
        char h = (char) n;
        System.out.println("Int to char: " + h);

        // Char to int (implicit)
        char c = 'A';
        int d = c;
        System.out.println("Char to int: " + d);

        
    }
}



