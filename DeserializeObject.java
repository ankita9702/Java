package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObject {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		Object obj;
		try {
			fis= new FileInputStream("D:\\sample\\customer");
			ois = new ObjectInputStream(fis);
			while((obj=ois.readObject())!=null){
				Customer customer = (Customer) obj;
				System.out.println(customer.getCustid()+" "+customer.getName()+" "+customer.getCommn());
			}
		} catch (ClassNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		try {
			fis.close();
			ois.close();
		} catch (IOException e) {
			
		}
	}
}
