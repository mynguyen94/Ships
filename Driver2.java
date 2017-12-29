package driver2.java;

import java.util.Scanner;
import driver2.java.Driver2;
import specialsavings.java.SpecialSavings;

public class Driver2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//data for saver1
		System.out.printf("What's saver1's account blance? $");
		double balance1 = input.nextDouble();
		
		SpecialSavings saver1 = new SpecialSavings(balance1);
		//check if the balance is over $10000 in order to earn 10% interest rate
		//otherwise, the interest rate is 4%
		saver1.checkTheBalance();
		
		//calculate the monthly interest for saver1
		saver1.calculateMonthlyInterest();
		//display interest earned
		if(saver1.getAccountBalance() > balance1)
		{
			System.out.printf("\n2. Interest earned: $" + "%.2f",((saver1.getAccountBalance()) - balance1));
		}
		else
		{
			System.out.printf("\n2. Interest earned: $" + "%.2f",(balance1 - (saver1.getAccountBalance()) ));
		}
		
		//Ask for the amount deposit or withdraw from saver1
		System.out.printf("\n3. How much do you want to deposit into the account? $");
		double depositAmount = input.nextDouble();
		saver1.deposit(depositAmount);
		System.out.printf("4. How much do you want to withdraw? $");
		double withdrawAmount = input.nextDouble();
		saver1.withdraw(withdrawAmount);	
		
		//display the new balance
		saver1.print();
		System.out.printf("\n");
		
		//data for saver2
		System.out.printf("\nWhat's saver2's account balance? $");
		double balance2 = input.nextDouble();
					
		SpecialSavings saver2 = new SpecialSavings(balance2);
		saver2.checkTheBalance();
		
		//calculate the monthly interest for saver2
		saver2.calculateMonthlyInterest();
		if(saver2.getAccountBalance() > balance2)
		{
			System.out.printf("\n2. Interest earned: $" + "%.2f",((saver2.getAccountBalance()) - balance2));
		}
		else
		{
			System.out.printf("\n2. Interest earned: $" + "%.2f",(balance2 - (saver2.getAccountBalance()) ));
		}
		
		//Ask for the amount deposit or withdraw from saver1
		System.out.printf("\n3. How much do you want to deposit into the account? $");
		depositAmount = input.nextDouble();
		saver2.deposit(depositAmount);
		System.out.printf("4. How much do you want to withdraw? $");
		withdrawAmount = input.nextDouble();
		saver2.withdraw(withdrawAmount);
		
		//display the new balance		
		saver2.print();
		
	}//end main
	
}//end SpecialSavings class
		


