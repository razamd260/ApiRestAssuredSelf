package RequestChaining;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class Delete {
	
	@Test
	public void test01(ITestContext context) {
		
	   	 String user_name= (String) context.getSuite().getAttribute("user_name");
		    System.out.println("id form  DElet Method:"+user_name);	
		 
	      given().pathParam("user", user_name).
	   
	        when().
	        delete("http://localhost:3000/users/{user}").
	        then().statusCode(204);
	        //log().all();
	}

}
