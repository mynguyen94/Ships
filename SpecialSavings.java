package specialsavings.java;

import specialsavings.java.SpecialSavings;
import savingsaccount.java.SavingsAccount;

public class SpecialSavings extends SavingsAccount{
	
	private double accountBalance;
	private double interestRate;
	
	//constructors
	public SpecialSavings(){
		accountBalance = 0.00;
		interestRate = 0.00;
	}	
	public SpecialSavings(double balance){
		accountBalance = balance;
	}
	
	//setters
	public void getAccountBalance(double balance){
		accountBalance = balance;
	}
	public void getInterestRate(double interest){
		interestRate = interest;
	}
	
	//override method
	public void calculateMonthlyInterest(){
		double monthlyInterest = (accountBalance * interestRate) / 12;
		accountBalance += monthlyInterest;				
	}	
		
	public void checkTheBalance(){
	
		if(accountBalance > 10000)
		{
			System.out.printf("1. The account balance is over $10000. ");
			System.out.printf("You will earn 10 percent interest rate.");
			getInterestRate(0.1);
			
		}
		else
		{
			System.out.printf("1. The account balance is below $10000. ");
			System.out.printf("You will earn 4 percent interest rate.");
			getInterestRate(0.04);
		}
	}	
	
	public void deposit(double depositAmount){
		accountBalance += depositAmount;
	}
	public void withdraw(double withdrawAmount){
		accountBalance  -= withdrawAmount;
	}

	//getter
	public double getAccountBalance(){
		return accountBalance;
	}
	
	public void print(){
			System.out.printf("5. New account balance is $" + "%.2f",accountBalance);
	}
	

}
