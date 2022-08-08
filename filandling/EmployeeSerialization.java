package filandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fout=new FileOutputStream("D://a.txt");
ObjectOutputStream obj=new ObjectOutputStream(fout);
employee e=new employee();
e.id=1;
e.city="Sana";
e.name="asj";
obj.writeObject(e);
System.out.println("data is save");
}

}
