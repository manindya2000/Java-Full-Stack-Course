package com.anindya.HelloWorld;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	//Variable 
    	int value1=10, value2;
    	value2=value1*20;
    	System.out.println(value2);
    	
    	//float and double
    	int x=9;
    	System.out.println(9/2f);
    	float y=2.56985f;
    	System.out.println(y);
    	
    	//Boolean and Char
    	boolean var;
    	var=true;
    	char ch='A';
    	System.out.println(var);
    	System.out.println(ch);
    	
    	//String 
    	String var1="Study";
    	String var2="100";
    	int var3=100;
    	System.out.println(var1+var2+var3);
    	System.out.println(Integer.parseInt(var2)+100);
    	
    	//Type Casting
    	//Implicit Type Casting
    	short a1=10;
    	byte a2=127;
    	int a3=a2; //(Implict)
    	System.out.println(a3);
    	
    	//Explicit Type Casting of same data type
    	short sh=1000;
    	byte b=(byte)sh; //(Explicit)
    	System.out.println(b);
    	
    	//Explicit Type Casting of different data type
    	// It is called parsing not casting
    	String st="5000";
    	int in=Integer.parseInt(st);
    	System.out.println(in);
    	double d=502.369;
    	int i=(int)d;
    	System.out.print(i);
    }
}
