//Program to find the factorial of each number in the given array
package com.vishnu.arrays;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i,j,sum;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			sum=1;
		for(j=arr[i];j>0;j--)
		{
		sum*=j;	
		}
		System.out.println(arr[i]+" factorial is "+sum);
		}
		
		
	}

}
