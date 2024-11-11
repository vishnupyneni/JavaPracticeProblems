//Program to find the sum of first even and last odd number
package com.vishnu.arrays;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i,j,even= 0,odd=0;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even=arr[i];
				
				break;
			}
	    }

		
		for(i=n-1;i>=0;i--)
		{
			if(arr[i]%2!=0)
			{
				odd=arr[i];
				
				break;
			}
	    }
		System.out.println(even+odd);
	}

}
