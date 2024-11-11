package com.vishnu.strings;

import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" strings");
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("lengthof the string:");
		for(int i=0;i<n;i++)
		{
			int p=arr[i].length();
			System.out.println(p);
		}
		

	}
}
