//Program to display odd numbers in reverse order
package com.vishnu.arrays;

import java.util.Scanner;

public class Example6 {

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
		for(i =n-1;i>=0;i--)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		


}
}
