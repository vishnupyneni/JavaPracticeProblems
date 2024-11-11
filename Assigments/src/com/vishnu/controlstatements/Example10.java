package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a value of n");
	    int n=sc.nextInt();
	    if(n%3==0 && n%5==0)
	    {
	    	System.out.println("it is divisible by both 3 and 5");
	    }
	    else
	    {
	    	System.out.println("it is not divisible by both 3 and 5");
	    }

		}

}
