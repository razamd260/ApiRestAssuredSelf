package Session12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deseri {
     public static void main(String[] args)   {
    		String filename="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\Serialization1.json.txt";
    		
    			try {
    				FileInputStream file=new FileInputStream(filename);
        			ObjectInputStream in=new ObjectInputStream(file);
        			Class student= (Class)in.readObject();
        			System.out.println(student.name);
        			System.out.println(student.id);
        			file.close();
        			in.close();
    			}
    		catch(FileNotFoundException e1) {
    			e1.printStackTrace();
    		}
    		catch(IOException e) {
    			e.printStackTrace();
    		}
    			catch(ClassNotFoundException e) {
    				e.printStackTrace();
    			}
    		
    		

    		
     }
}
