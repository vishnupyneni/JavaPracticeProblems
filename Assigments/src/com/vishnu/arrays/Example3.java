//Print Only even numbers in the array
package com.vishnu.arrays;

import java.util.Scanner;

public class Example3 {
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
		for(i =0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}

	}



}
