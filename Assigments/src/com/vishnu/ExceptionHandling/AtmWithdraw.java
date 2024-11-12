package com.vishnu.ExceptionHandling;
//to check the bank balance of the user and if(withdraw amount>balance)--->
//throw lowbalance exception 



public class AtmWithdraw {
	private int balance=5000;
	
public void	checkBalance(int withDrawAmount) throws LowBalanceException
{
	if(withDrawAmount>balance)
	      {
				throw new LowBalanceException("Low Balance");
	      }
	else 
		{
			System.out.println("Please collect your cash:"+withDrawAmount);
		}
}

}
