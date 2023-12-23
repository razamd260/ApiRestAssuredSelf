package Session20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SvsD_1 {
    
	public static void main(String[] args) {
		ClassS_D student=new ClassS_D();
		student.setname("NOUSHAD");
		student.setid(1);
		student.setjob("Jobless");
		
		  String file="C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\S1.json.txt";
		  try {
			  FileOutputStream out=new FileOutputStream(file);
			  ObjectOutputStream objoutput=new ObjectOutputStream(out);
			  objoutput.writeObject(student);
			  objoutput.close();
			  out.close();
			  
		  }
	       catch(FileNotFoundException e1) {
	    	   e1.printStackTrace();
	       }
		  catch(IOException e1) {
			  e1.printStackTrace();
		  }
		  catch(Exception e1) {
			  e1.printStackTrace();
		  }
	try {
		 FileInputStream in=new FileInputStream("C:\\Users\\hii\\OneDrive\\Desktop\\Seri$Deseri\\S1.json.txt");
	     ObjectInputStream objinput=new ObjectInputStream(in);
        	ClassS_D get=(ClassS_D) objinput.readObject();
	        System.out.println(get.getid());
	        System.out.println(get.getname());
            System.out.println(get.getjob());
	}
	catch(FileNotFoundException e1) {
		e1.printStackTrace();
	}
	catch(Exception e1) {
		
	}
	}
}
