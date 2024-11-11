package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example2 {
	  public static void main(String args[]) {
		    
		    System.out.println("enter the number");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    if(n%2==0)
		    {
		        System.out.println("it is Even");
		    }
		    else
		    {
		        System.out.println("it is odd");
		    }
		  }

}
