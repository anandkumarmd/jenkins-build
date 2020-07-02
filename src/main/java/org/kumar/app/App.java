package org.kumar.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		System.out.println(" - - - - - -  "+args.length+" - - - - ");
        System.out.println( "Hello World!" );
		
		int x = 1;
		int y = 2;
		addNumbers(x,y);
    }
	
	public static void addNumbers(int x, int y) {
		int sum = x + y;
	}
}
