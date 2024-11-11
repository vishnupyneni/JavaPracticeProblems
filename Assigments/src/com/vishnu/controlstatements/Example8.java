package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=sc.nextInt();
		System.out.println("Enter number b:");
		int b=sc.nextInt();
		System.out.println("Enter number c:");
		int c=sc.nextInt();
		{
			String check=a*b == c?"Equal":"not Equal";
			System.out.println(check);
		}

	}

}
