package stringBuffer_stringBuilder;

public class Main {

	    public static void main(String[] args) {

	        String[] sbuffer = {"Thread Safe", "Medium Fast ","Less memory ","Mutable"};
	        String[] Sbuilter  = {"No thred safe", "need object creation ","Less memory","        Mutable"};

	        System.out.println("tStringBuffer \t \tStringBuilder");
	        System.out.println("--------------------------------------");

	        for (int i = 0; i < sbuffer.length; i++) {
	            System.out.println( sbuffer[i] + "\t\t" + Sbuilter[i]);
	        }System.out.println("--------------------------------------");
	    
		}
	}
	

	



