package Session23;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import Session22.EmployeeAddress;
import Session22.EmployeePojoClass;

public class DemoTestComplexNestedJSONObject {
   @Test
	public void test01() {
		NestedJSONPojoClass requestPayload=new NestedJSONPojoClass();
		requestPayload.setCompanyName("xylem");
		requestPayload.setState("Jharkhand");
		requestPayload.setStreet("Bank More");
		requestPayload.setPincode("829149");
		List<String> listobject=new ArrayList<>();
		listobject.add("HDFC");
		listobject.add("ICICI");
		listobject.add("SBI");
		requestPayload.setBankAccount(listobject);
		requestPayload.setCity("Boakro");
		
		EmployeePojoClass emp1=new EmployeePojoClass();
		    emp1.setfirstname("Md Noushad");
		    emp1.setlastname("Ansari");
		    emp1.setgender("Male");
		    emp1.setage(28);
		    emp1.setsalary(12000);
		    EmployeeAddress address1=new EmployeeAddress();
		    address1.setCity("Ranchi");
		    address1.setPincode(829149);
		    address1.setState("Jharkhand");
		    address1.setStreet("Bank More");
		    emp1.setAddress(address1);
		    List<EmployeePojoClass> employeeList=new ArrayList<EmployeePojoClass>();
		    employeeList.add(emp1);
		    requestPayload.setEmployeeList(employeeList);
		    
		ObjectMapper mapper=new ObjectMapper();
		try {
			String details=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestPayload);
			System.out.println(details);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
