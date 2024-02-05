package RequestChaining;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PostMethod {
	
	/*
	 *{
  "id": 0,
  "username": "string",
  "firstName": "string",
  "lastName": "string",
  "email": "string",
  "password": "string",
  "phone": "string",
  "userStatus": 0
}
	 */
      @Test 
	public void test01(ITestContext context) {
    	  JSONObject json=new JSONObject();
    	  
    	  json.put("username", "razamd260");
    	  json.put("firstName", "MD");
    	  json.put("firstName", "NOUSHAD");
    	  json.put("email", "razamd260@gmail.com");
    	  json.put("password", "1233");
    	  json.put("phone", "6205860286");
    	  
		  
    	 Response res= given().baseUri("http://localhost:3000/users").contentType(ContentType.JSON).body(json.toString()).
    	  
		     
		     when().post();//.then().log().all();
    	     String user_name=res.jsonPath().get("id").toString();
    	     System.out.println(user_name);
    	     context.getSuite().setAttribute("user_name", user_name);
    	         

    	   
	}
}
