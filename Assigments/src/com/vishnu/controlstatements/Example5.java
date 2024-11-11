package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example5 {
	public static void main(String args[]) {
	    
		  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number a");
	    int a=sc.nextInt();
	    System.out.println("enter the number b");
	    int b=sc.nextInt();
	    System.out.println("enter the number c");
	    int c=sc.nextInt();
	   
	    
	    if(a+b==c%10)
	    {
	        System.out.println("equal");
	    }
	    else
	    {
	        System.out.println("not equal");
	    }
	  }

}
