package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example6 {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age");
	    int age=sc.nextInt();
	    
	    if(age>=18)
	    {
	        System.out.println("eligible");
	    }
	    else
	    {
	        System.out.println("not eligible");
	    }
	  }

}
