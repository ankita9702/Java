package ankita;

public class CustomerApplication {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerId(117);
		customer.setCustomerName("Ankita");
		customer.setCity("Hyderabad");
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCity());
	}

}
