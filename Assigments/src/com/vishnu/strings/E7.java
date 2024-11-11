package com.vishnu.strings;

import java.util.Arrays;

public class E7 {
	public static void main(String args[])
    {
		String s1="vishnu";
		String s2="unhkiv";
		Boolean boolean1=false;
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		
		if(str1.length!=str2.length)
		{
			System.out.println("Not Anagrams");
		}
		else {
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<str1.length;i++)
			{
				if(str1[i]!=str2[i])
				{
					boolean1=true;
					break;
				}
			}
			if(boolean1==true)
			{
				System.out.println("Not Anagram");
			}
			else {
				System.out.println("Anagram");
			}
		}
    }
}
