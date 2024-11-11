package com.vishnu.strings;

public class E1 {
	public static void main(String[] args) {
		String s1="vishnusai";
		char[] arr=new char[s1.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.charAt(i);
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		

	}
}
