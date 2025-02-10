package com.anindya.java.JavaMethods; //File system

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//Basic Method Calling
    	loop(0,30);
    	System.out.println("************************");
    	loop(-30,0);
    	
    	//Method Overload Calling
    	System.out.println("The Area of Square is: "+ area(5.23));
    	
    }
    
    //Basic Method Definition (Non Unique different parameter lists with different sequence)
	public static void loop (int start, int stop) {
		for(;start<=stop;start++) {
			System.out.println(start);
		}
	}
	
	//Method Overloading
	public static int area(int x, int y) {
		return x*y;
	}
	
	public static int area(int side) {
		return side*side;
	}
	
	public static double area(double side) {
		return side*side;
	}
	
	//Java number literals: 
	   // Starting with 0 is octal
	   // Starting with 0x is Hexadecimal
	   // Starting with 0b is Binary
}
