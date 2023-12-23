package Session12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
    	Class student=new Class();
    	student.name="MD NOUSHAD ANSARI";
    	student.id=786;
    	String filename="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\Serialization1.json.txt";
    	try {
    		FileOutputStream out=new FileOutputStream(filename);
    		ObjectOutputStream oss=new ObjectOutputStream(out);
    		oss.writeObject(student);
    		oss.close();
    		out.close();
    	}
    	catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	catch(IOException e1) {
    		e1.printStackTrace();
    	}
	}
}
