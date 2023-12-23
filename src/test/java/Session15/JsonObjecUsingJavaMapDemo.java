package Session15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonObjecUsingJavaMapDemo {
     @Test(enabled=false)
	public void test01() {
    	 Map<String ,String> map=new HashMap<String, String>();
    	 map.put("username", "admin");
    	 map.put("password","password123");
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		 Response response =req.baseUri("https://restful-booker.herokuapp.com/auth").contentType(ContentType.JSON).body(map).when().post();	
		 response.prettyPrint();
	  }
     
     @Test
     public void test02() {
    	 Map<String,Object> map=new HashMap<String, Object>();
    	 map.put("name", "MD NOUSHAD ANSARI");
    	 ArrayList<String> hobbies=new ArrayList<String>();
    	 hobbies.add("Cricket");
    	 hobbies.add("Riding");
    	 map.put("Hobbies", hobbies);
    	 map.put("address", "lalpania");
    		RestAssured rest=new RestAssured();
    		RequestSpecification req=rest.given();
    	 Response response =req.baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(map).when().post();	
		 response.prettyPrint();
    	 
     }
     
}
