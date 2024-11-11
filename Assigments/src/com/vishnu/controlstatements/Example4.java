package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example4 {
	public static void main(String args[]) {
	    
		  
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number m1");
	    int m1=sc.nextInt();
	    System.out.println("enter the number m2");
	    int m2=sc.nextInt();
	    System.out.println("enter the number m3");
	    int m3=sc.nextInt();
	    System.out.println("enter the number m4");
	    int m4=sc.nextInt();
	    
	    if((m1+m2+m3+m4)/4>=60)
	    {
	        System.out.println("Greater than 60");
	    }
	    else
	    {
	        System.out.println("Less than 60");
	    }
	}
}
