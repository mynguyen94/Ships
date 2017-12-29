/*Name: My Nguyen
  Class: 35A
  Due date: 02/10/27
  Date submitted: 02/17/17
  Description: The driver class is written to test the SavingsAccount class
 */

package driver1.java;

import driver1.java.Driver;
import savingsaccount.java.SavingsAccount;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
	
		for(int i = 0; i < 2; i++)
		{
			System.out.printf("What's saver1's account blance? $");
			double balance1 = input.nextDouble();
			System.out.printf("What's saver2's account blance? $");
			double balance2 = input.nextDouble();
			System.out.printf("What's the annual interest rate? ");
			double interestRate = input.nextDouble();
			
			//create 2 objects of SavingsAccount class
			SavingsAccount saver1 = new SavingsAccount(balance1);
			SavingsAccount saver2 = new SavingsAccount(balance2);
			
			//set the annualInterestRate to the new value
			SavingsAccount.modifyInterestRate(interestRate);
			
			//calculate the monthly interest for saver1 and saver2
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
		
			System.out.printf("New account balance of saver1: $" + "%.2f", saver1.getSavingsBalance());
			System.out.printf("\nNew account balance of saver2: $" + "%.2f", saver2.getSavingsBalance());			
			System.out.printf("\n");
			System.out.printf("\n");
		}
		
	}//end main

}//end Driver class
