package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
			System.out.println("voewls");
		}
		else
		{
			System.out.println("not");
		}
		
	

	}

}
