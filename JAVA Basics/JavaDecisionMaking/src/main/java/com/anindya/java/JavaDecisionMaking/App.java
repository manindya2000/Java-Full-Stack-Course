package com.anindya.java.JavaDecisionMaking;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Arithmetic Operator
    	
    	int x =10+11*10;
    	String text = "Study"+"Easy";
    	System.out.println(text);
    	System.out.println(x);
    	
    	int mod=13%2;
    	System.out.println(mod);
    	int y=5;
    	System.out.println(y++);
    	System.out.println(y--);
    	
    	//Decision Making with operators
    	int z=7;
    	if(z==6) 
    		System.out.println("z is 6");
    	else 
    		System.out.println("Z is not equal to 6");
    	
    	boolean b1=true;
    	boolean b2=false;
    	if(b1 && b2) {
    		System.out.println("Condition is true");
    	}else {
    		System.out.println("Condition is false");
    	}
    	
    	int ageOfBoy=21;
    	int ageOfGirl=17;
    	
    	if((ageOfBoy>=21) && (ageOfGirl)>=18) 
    		System.out.println("Eligible for marriage");
    	else
    		System.out.println("Wait for it kiddo!!!");
        
        //Ternary operator
        
        int value=10;
        String result=(value==10)?"The value i 10":"The value is not equal to 10";
        System.out.println(result);
        
        //Assignment operator
        
        int val=5;
        val+=5;
        val+=10;
        val%=3;
        System.out.println(val);
       
        //Example of post & pre increment
        
        int a=3;
        a=a++;
        System.out.println("Post-Increment a: " +a);
     
        a=++a;
        System.out.println("Pre-Increment a: "+a );
     
        a=a--;
        System.out.println("Post-Decrement a: " +a);
     
        a=--a;
        System.out.println("Pre-Decrement a: "+a );

    }
    
}
