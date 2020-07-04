package org.kumar.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/* commment out for code coverage
		System.out.println(" - - - - - -  "+args.length+" - - - - ");
        System.out.println( "Hello World!" );
		
		int x = 1;
		int y = 2;
		addNumbers(x,y);
		*/
		addNumbers(1,2);
    }
	
	public static void addNumbers(int x, int y) {
		int a = x;
		int b = y;
		int sum1 = a + b;
		int sum2 = x + y;
		System.out.println("sum1 ="+sum1);
		System.out.println("sum2 ="+sum3);
		int rv = sum1 + sum2
		System.out.println("rv ="+rv);
		
		int sub1 = rv - sum1;
		int sub2 = rv - sum2;
		System.out.println("sub1 ="+sub1);
		System.out.println("sub2 ="+sub3);
	}
}
