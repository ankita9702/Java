package ankita;

public class AccountApplication {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNumber(117);
		account.setBalance(6000);
		account.setCustomerName("Ankita");
		Account account2 = new Account();
		Account account3 = new Account(115,"Aishwarya",60000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getCustomerName());
		System.out.println(account2.getBalance());
		System.out.println(account3.getAccountNumber());
		System.out.println(account3.getCustomerName());
		System.out.println(account3.getBalance());
	}
}
