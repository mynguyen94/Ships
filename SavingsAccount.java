
package savingsaccount.java;

import savingsaccount.java.SavingsAccount;

public class SavingsAccount {
	
	static double annualInterestRate;
	private double savingsBalance;
	
	//constructor
	public SavingsAccount(){
		savingsBalance = 0.00;
		annualInterestRate = 0.00;
	}
	public SavingsAccount(double balance){
		this.savingsBalance =  balance;
	}
	
	//setters
	public void setSavingsBalance(double balance){
		savingsBalance = balance;
	}
	public static void modifyInterestRate(double interest){
		annualInterestRate =  interest;
	}
	
	//getters
	public double getSavingsBalance(){
		return savingsBalance;
	}
	public static double getInterestRate(){
		return annualInterestRate;
	}
	
	
	//method calculates the monthly interest
	public void calculateMonthlyInterest(){
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;				
	}	
	
	//print method
	public void print()
	{
		System.out.print(savingsBalance);
		System.out.print(annualInterestRate);
	}

}//end of class SavingsAccount
