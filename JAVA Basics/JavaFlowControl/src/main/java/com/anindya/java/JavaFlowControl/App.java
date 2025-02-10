package com.anindya.java.JavaFlowControl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Switch Case Normal 
    	
        int input=3;
        switch(input) {
        default:
        	System.out.println("The value is unknown");
        	break;
        case 1:
        	System.out.println("The answer is 1");
        	break;
        case 2:
        	System.out.println("The answer is 2");
        	break;
        case 3:
        	System.out.println("The answer is 3");
        	        
        }
        
     //Switch case with lambda
        int x=3;
        switch(x) {
        case 1 -> System.out.println("The value of x is 1");
        case 2 -> System.out.println("The value of x is 2");
        case 3 -> System.out.println("The value of x is 3");
        default -> System.out.println("The value of x is unkonwn");
        }
        
      //Switch case with String and Character
        String s="EdiTor";
        switch(s.toLowerCase()) {
        case "editor":
        	System.out.println("Anindya");
        	break;
        case "owner":
        	System.out.println("Jyoti");
        	break;
        default:
        	System.out.println("No Option");
        }
        
        char c='B';
        switch(c) {
        case 'a':
        	System.out.println("a");
        	break;
        case 'b':
        	System.out.println("b");
        	break;
        default:
        	System.out.println("No Option");
        }
        
        //For Loop
        for(int i=0;i<=10;i++) {
        	System.out.println(i);
        }
        for(int i=10;i>0;i--) {
        	System.out.println(i);
        }
        
        int j=20;
        for(;;) {
        	++j;
        	if(j<=30) {
        		System.out.println(j);
        	}
        	else
        		break;
        }
        
        //While Loop
        int z=0;
        while(z<=10) {
        	System.out.println(z);
        	z++;
        }
        
        //Do While Loop
        int w=50;
        do {
        	System.out.println(w);
        	w+=2;
        }while(w<=70);
        
        //Continue keyword usage
        //Find an element (8) from an array
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        int ele=16;
        for(int i=0;i<10;i++) {
        	if(arr[i]==ele) {
        		System.out.println("Found!!");
        		break;
        	}
        	else
        		continue;
        }
        
        //Multi-Variable loops
        for(int i=0,r=0;i<10 || r<10;i++,r++) {
        	r++;
        	System.out.println("i >> j"+i+">>"+r);
        	
        }
        
        //For Each Loop
        int[] aar= {1,2,3,4,5,6,7,8,9};
        for(int val:aar) {
        	System.out.println("The value of the Array is: "+val);
        }
        
        //Nested Loop
        for(int q=1;q<=10;q++) {
        	for(int d=1;d<=q;d++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        // Sum of digits
        long number=8432234892548L;
        int sum=0;
        for(int f=0;number>0;f++) {
        	sum=sum+(int)(number%10);
        	number=number/10;
        }
        System.out.println(sum);
    }
}
