package com.vishnu.strings;

public class E4 {
	public static void main(String[] args) {
		String s="Victor the man of masses";
		String[] arr=s.split(" ");
		int n=arr.length;
		System.out.println("length of array is:"+n);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
