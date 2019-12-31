package utils;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(){
		super("Insufficient Balance. Transaction unsuccessful.");
	}
}
