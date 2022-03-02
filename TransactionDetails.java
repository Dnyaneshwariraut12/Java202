package ATMInterface;

import java.util.Scanner;

public class TransactionDetails {

	
	public static void main(String[] args) {
		
		//Declare and initialize balance, withdraw,deposit,check
		int deposit;
		int withdraw;
		int balance = 100000;
		
		//Create scanner object to get choice of users 
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to ATM\n");
		    System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for CheckBalance ");
			System.out.println("Choose 0 for Exit"); 
			
			//get choice from user
			int choice = scan.nextInt();
			
			
			switch(choice){
			case 1: System.out.println("Enter ammount to withdraw:");
			
			//get the money from user
			 withdraw = scan.nextInt();
			 
			 //check whether the balance is greater or equal to the withdraw amount 
			 if(balance >= withdraw) {
				 balance = balance - withdraw;
				 System.out.println("Please collect your amount");
				 
			 }
			 else {
				 //show custom error massage
				 System.out.println("Insufficient Balance");
			 }
			 System.out.println(" ");
			 break;
			 
			case 2: System.out.println("Enter ammount to be deposited:");
			
			//get deposit  amount from user
			deposit = scan.nextInt();
			
			//add the deposit amount in total amount
			balance = balance + deposit;
			System.out.println("Your money has been succesfully deposited");
			System.out.println(" ");
			break;
			
			//check balance
			case 3:
			 
				System.out.println(balance = +balance);
			System.out.println(" ");
			break;
			
			case 4: 
				//exit from the menu
				System.exit(0);
			
			}
		}
		
	}


}
