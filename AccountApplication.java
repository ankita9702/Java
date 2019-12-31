package utils;

import java.util.*;

public class AccountApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountOperations oper = new AccountOperations();
		int i=0;
		do{
			System.out.println("Choose an operation:-");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			i=sc.nextInt();
			int acno;
			double amount;
			switch(i){
			case 1:
				System.out.println("Enter Account number and Amount to be deposited.");
				acno=sc.nextInt();
				amount=sc.nextDouble();
				oper.deposit(acno, amount);
				break;
			case 2:
				System.out.println("Enter Account number and Amount to withdraw.");
				acno=sc.nextInt();
				amount=sc.nextDouble();
				oper.withdraw(acno, amount);
				break;
			case 3:
				System.out.println("Enter Account number.");
				acno=sc.nextInt();
				oper.checkBalance(acno);
				break;
			case 4:
				System.out.println("Thank You");
				break;
			default:
				System.out.println("Incorrect Option\n");
			}
		}while(i!=4);
	}
}
