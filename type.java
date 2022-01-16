package typecastingassited;

public class type {
public static void main(String[] args) {
	
		//implicit conversion//Widening
		System.out.println("Implicit Type Casting");
		char b='B';
		System.out.println("Value of b: "+b);
		
		int c=b;
		System.out.println("Value of c: "+c);

		float d=c;
		System.out.println("Value of d: "+d);
		
		long e=b;
		System.out.println("Value of e: "+e);
		
		double f=b;
		System.out.println("Value of f: "+f);
		
				
//		System.out.println("\n");
//		
		System.out.println("Explicit Type Casting");
		//explicit conversion//Narrowing
		
		double x=25.5;
		int y=(int)x;
		float z=23.7f;
		int a=(int)z;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		System.out.println("Value of a: "+a);
		
	}
}
