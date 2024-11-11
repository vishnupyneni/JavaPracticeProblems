package com.vishnu.controlstatements;

import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		{
			String var=n>=30 && n<50?"between 30 and 50":"not in between";
			System.out.println(var);
		}

		}

}
