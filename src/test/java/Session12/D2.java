package Session12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D2 {
	public static void main(String[] args) {
		String path="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\s2.json.txt";
		
		try {
			FileInputStream in=new FileInputStream(path);
			ObjectInputStream obj=new ObjectInputStream(in);
			
			Class c=(Class)obj.readObject();
			System.out.println(c.id);
			System.out.println(c.name);
			obj.close();
			in.close();
	  }
		catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
