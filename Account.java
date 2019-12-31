package utils;

public class Account {
	private int accno;
	private String custname;
	private double balance;
	public Account() {
		super();
	}
	/**
	 * @param accno
	 * @param custname
	 * @param balance
	 */
	public Account(int accno, String custname, double balance) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.balance = balance;
	}
	/**
	 * @return the accno
	 */
	public int getAccno() {
		return accno;
	}
	/**
	 * @param accno the accno to set
	 */
	public void setAccno(int accno) {
		this.accno = accno;
	}
	/**
	 * @return the custname
	 */
	public String getCustname() {
		return custname;
	}
	/**
	 * @param custname the custname to set
	 */
	public void setCustname(String custname) {
		this.custname = custname;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
