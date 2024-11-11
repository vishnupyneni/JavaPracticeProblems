//Program to display prime numbers in the array
package com.vishnu.arrays;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i,j,count = 0;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(arr[i]);
			}
	    }
	}

}
