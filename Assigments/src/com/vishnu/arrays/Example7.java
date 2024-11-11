//Program to find the biggest number in given array
package com.vishnu.arrays;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i,sum=0;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int big=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
		
		System.out.println(big);
	}


}
