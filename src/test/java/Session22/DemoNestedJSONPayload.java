package Session22;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Session21.Employee;

public class DemoNestedJSONPayload {
    
	@Test
	public void test01() throws JsonProcessingException {
		EmployeePojoClass emp1=new EmployeePojoClass();
	    emp1.setfirstname("Md Noushad");
	    emp1.setlastname("Ansari");
	    emp1.setgender("Male");
	    emp1.setage(28);
	    emp1.setsalary(12000);
	    EmployeeAddress address=new EmployeeAddress();
	    address.setCity("Ranchi");
	    address.setPincode(829149);
	    address.setState("Jharkhand");
	    address.setStreet("Bank More");
	    emp1.setAddress(address);
	    ArrayList<Object> a1=new ArrayList<Object>();
	    a1.add(emp1);
	 
	    ObjectMapper objMapper=new ObjectMapper();
	    try {
			String jsonArrayPayload = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(a1);
			System.out.println(jsonArrayPayload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
