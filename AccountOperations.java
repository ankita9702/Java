package utils;

import utils.AccountNotFoundException;
import utils.InsufficientBalanceException;

public class AccountOperations {
	Account[] accounts = new Account[5];
	private int flag;
	public AccountOperations() {
		accounts[0] = new Account(10019, "tara", 8000);
		accounts[1] = new Account(10115, "aishwarya", 38000);
		accounts[2] = new Account(10116, "babli", 8000);
		accounts[3] = new Account(10117, "niki", 2000);
		accounts[4] = new Account(10118, "candy", 18000);
	}
	void deposit(int acno,double amount){
		flag=0;
		for(Account acc : accounts){
			if(acc.getAccno()==acno){
				flag++;
				acc.setBalance(acc.getBalance()+amount);
				System.out.println("\nThe updated balance is "+acc.getBalance()+"\n");
			}	
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}		
	}
	void withdraw(int acno,double amount){
		flag=0;
		for(Account acc : accounts){
			if(acc.getAccno()==acno){
				flag++;
				try{
					if(amount>acc.getBalance())
						throw new InsufficientBalanceException();
					else{
						acc.setBalance(acc.getBalance()-amount);
						System.out.println("\nThe updated balance is "+acc.getBalance()+"\n");
					}
				}
				catch(InsufficientBalanceException e){
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	void checkBalance(int acno){
		flag=0;
		for(Account acc : accounts){
			if(acc.getAccno()==acno){
				flag++;
				System.out.println("\nThe available balance is "+acc.getBalance()+"\n");
			}	
		}
		try{
			if(flag==0)
				throw new AccountNotFoundException();
		}
		catch(AccountNotFoundException e){
			//e.printStackTrace();
			System.out.println(e.getMessage()); 
		}		
	}
}
