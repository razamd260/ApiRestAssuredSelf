package Session24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Session22.EmployeeAddress;
import Session22.EmployeePojoClass;

public class DemoJsonInclude {
     
	@Test
	public void testMethod1() throws JsonProcessingException
	{
		//create payload
		EmployeePojoClass emp1 = new EmployeePojoClass();
		emp1.setfirstname("Suresh");
		//emp1.setLastname("Mehra");
		emp1.setgender("Male");
		emp1.setage(35);
		emp1.setsalary(10000);
		emp1.setMarried(true);

	// Empty array
		String[] hobbies=  new String[2];
		hobbies[0] = "Reading";
		hobbies[1] = "Music";
		emp1.setHobbies(hobbies);
		
		// Empty list
		List<String> degrees= new ArrayList<String>();
		degrees.add("BCA");
		degrees.add("MCA");
		emp1.setDegree(degrees);
		
		// Empty Map
		Map<String,String> familyMembers = new HashMap<>();
		familyMembers.put("1", "Mother");
		familyMembers.put("2", "Father");
		emp1.setFamilyMember(familyMembers);

		//convert employee class object to json payload as string

		ObjectMapper objMapper = new ObjectMapper();

		String employeeJSON = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);

		System.out.println(employeeJSON);


	}
}
