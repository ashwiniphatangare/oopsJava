package filandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class employeeDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("D://a.txt");
		ObjectInputStream obj=new ObjectInputStream(fin);
		employee e=(employee) obj.readObject();
		System.out.println("employee detail are"+"id"+e.id+"name"+e.name+"city"+e.city);
		
	}

}
