package Session21;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONArrayPojoClassDemo {
     
	@Test
	public void test01() {
		Employee emp1=new Employee();
	    emp1.setfirstname("Md Noushad");
	    emp1.setlastname("Ansari");
	    emp1.setgender("Male");
	    emp1.setage(28);
	    emp1.setsalary(12000);
	    
	    Employee emp2=new Employee();
	    emp2.setfirstname("Md Azad");
	    emp2.setlastname("Ansari");
	    emp2.setgender("Male");
	    emp2.setage(35);
	    emp2.setsalary(60000);
	    
	    Employee emp3=new Employee();
	    emp3.setfirstname("Md akber");
	    emp3.setlastname("Ansari");
	    emp3.setgender("Male");
	    emp3.setage(37);
	    emp3.setsalary(32000);
	    
		ArrayList<Object> listOfEmp=new ArrayList<Object>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		
		ObjectMapper objMapper=new ObjectMapper();

		try {
			String jsonArrayPayload = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfEmp);
			System.out.println(jsonArrayPayload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
