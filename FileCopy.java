package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("D:\\sample\\resume");
			fos = new FileOutputStream("D:\\sample\\test");
			int x;
			while((x=fis.read())!=-1){
				fos.write((char)x);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
