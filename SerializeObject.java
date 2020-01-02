package streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream("D:\\sample\\customer");
			oos = new ObjectOutputStream(fos);
			Customer customer1 = new Customer(117, "niki", 5000);
			Customer customer2 = new Customer(115, "fancy", 5000);
			oos.writeObject(customer1);
			oos.writeObject(customer2);
		} catch (IOException e) {
			
		}
		try {
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
