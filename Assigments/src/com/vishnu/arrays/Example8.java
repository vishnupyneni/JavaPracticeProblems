//write a program to display the multiplication table of each number in the given array
package com.vishnu.arrays;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int i,j;
		System.out.println("Enter Array Values");
		for(i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
		for(j=1;j<=10;j++)
		{
			System.out.println(arr[i]+" x "+j+" = "+arr[i]*j);
		}
		System.out.println();
		}
		
		
	}

}
