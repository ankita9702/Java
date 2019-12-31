package utils;

public class AccountNotFoundException extends Exception{
	public AccountNotFoundException(){
		super("Account not found");
	}
}
