package RequestChaining;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class PutMethod {
    @Test
	public void test03(ITestContext context) {
    	
    	 String user_name= (String) context.getSuite().getAttribute("user_name");
		    System.out.println("id form  Put Method:"+user_name);	
    	
    	
    	
    
    	JSONObject json=new JSONObject();
    	 json.put("username", "razamd260");
   	     json.put("firstName", "MD NOUSHAD ANSARI");
   	     json.put("email", "razamd260@gmail.com");
   	     json.put("Address", "BANK MORE LALPANIA");
    
 
   		 
		  given().contentType(ContentType.JSON). body(json).pathParam("user", user_name).
		      
		      when().put("http://localhost:3000/users/{user}").
		      
		           then().statusCode(200);
	}
	
}
