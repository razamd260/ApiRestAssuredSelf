package Session12;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class S1 {
	public static void main(String[] args) {
        String file="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\d1.json.txt";
        
        Class student=new Class();
        student.name="md sarfraj ansari";
        student.id=5;
        try {
        	FileOutputStream fis =new FileOutputStream(file);
        	ObjectOutputStream oss=new ObjectOutputStream(fis);
        	oss.writeObject(student);
        	oss.close();
        	fis.close();
        }
        catch(FileNotFoundException e) {
        	e.printStackTrace();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
	}
}
