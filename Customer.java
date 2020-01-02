package streams;

import java.io.Serializable;

public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	private int custid;
	private String name;
	private double commn;
	/**
	 * @param custid
	 * @param name
	 * @param commn
	 */
	public Customer(int custid, String name, double commn) {
		super();
		this.custid = custid;
		this.name = name;
		this.commn = commn;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	/**
	 * @return the custid
	 */
	public int getCustid() {
		return custid;
	}
	/**
	 * @param custid the custid to set
	 */
	public void setCustid(int custid) {
		this.custid = custid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the commn
	 */
	public double getCommn() {
		return commn;
	}
	/**
	 * @param commn the commn to set
	 */
	public void setCommn(double commn) {
		this.commn = commn;
	}
}
