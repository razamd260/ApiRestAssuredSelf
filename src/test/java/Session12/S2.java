package Session12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class S2 {
    public static void main(String[] args) {
		String path="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\s2.json.txt";
		Class c=new Class();
		c.name="chinu";
		c.id=1;
		
		try {
			FileOutputStream out=new FileOutputStream(path);
			ObjectOutputStream obj=new ObjectOutputStream(out);
			obj.writeObject(c);
			obj.close();
			out.close();
		}
	catch(FileNotFoundException e1) {
		e1.printStackTrace();
	}
		catch(IOException e1) {
			e1.printStackTrace();
		}
    }
}
