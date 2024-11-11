//Program to swap first and last elements of the array
package com.vishnu.arrays;

import java.util.Scanner;


public class Example4 {
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
		int temp;
		temp=arr[0];
		arr[0]=arr[n-1];
		arr[n-1]=temp;
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
