package Session12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D1 {
	public static void main(String[] args) {
	     String file="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\d1.json.txt";
	     try {
	    	 FileInputStream fis=new FileInputStream(file);
	    	 ObjectInputStream obj=new ObjectInputStream(fis);
	    	 Class c=(Class)obj.readObject();
	    	 System.out.println(c.name+"  ::  "+c.id);
	    	 fis.close();
	    	 obj.close();
	     }
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }catch(IOException e) {
		   e.printStackTrace();
	   }catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	}
}
