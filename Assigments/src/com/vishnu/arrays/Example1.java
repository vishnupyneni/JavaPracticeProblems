//Program to display array elements in reverse Order
package com.vishnu.arrays;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(i = n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
