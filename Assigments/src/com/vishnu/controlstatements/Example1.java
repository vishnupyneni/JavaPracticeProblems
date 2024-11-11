package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example1 {
	  public static void main(String args[]) {
		    
		    System.out.println("enter the number");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    if(n%3==0)
		    {
		        System.out.println("it is Divisible");
		    }
		    else
		    {
		        System.out.println("it is not divisible");
		    }
		  }

}
