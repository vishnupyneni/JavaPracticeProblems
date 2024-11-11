package com.vishnu.strings;

public class E6 {
	public static void main(String[] args) {
		String s="vishnu is 1st in the class and 2nd iin games";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.println("Given digits in the string are:"+ch);
			}
			
		}

	}

}
