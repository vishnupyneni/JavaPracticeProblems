package com.vishnu.ExceptionHandling;

import java.util.Scanner;

public class MainAtm {
	
	public static void main(String[] args)
	{
		
	
	System.out.println("*****Welcome to ATM*****");
	System.out.println("Please Select an option");
	System.out.println("1.Check Balance");
	System.out.println("2.Cash WithDraw");
	System.out.println("Enter the option:");
	
	Scanner scanner=new Scanner(System.in);
	AtmWithdraw atmWithdraw=new AtmWithdraw();
	int n=scanner.nextInt();
	if(n==1)
	{
		System.out.println("Your balance is $5000");
		System.out.println("******Thankyou******");
	}
	else if(n==2)
	{
		System.out.println("Enter WithDraw Amount");
		int withdraw=scanner.nextInt();
		
		try 
		{
			atmWithdraw.checkBalance(withdraw);
		} 
		catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception :"+e.getMessage());
		}
		
	}
	
	
	
	}

}
