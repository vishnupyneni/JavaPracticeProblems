package com.vishnu.strings;

public class E5 {
	public static void main(String[] args) {
		String s1="kllk";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
		}
		if(s1.equals(s2))
		{
			System.out.println("s1 is palindrome");
		}
		else
		{
			System.out.println("s1 is not palindrome");
		}
	}
}
