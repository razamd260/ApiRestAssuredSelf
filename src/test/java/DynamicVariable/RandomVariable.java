package DynamicVariable;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class RandomVariable<T> {
    @SuppressWarnings({ "unchecked","rawtypes"})
   
	
    @Test
	public void test01() {
    	 Faker fake=new Faker();
		JSONObject json=new JSONObject();
		json.put("name", fake.name().firstName());
		json.put("job", fake.address().streetName());
		
	   Response response=given().contentType(ContentType.JSON).
		
		     when().post("https://reqres.in/api/users/2");
	         String head=response.header("Nel");
	           
	    
	      //String check=response.jsonPath().get("Nel");
	      System.out.println(head);
		               
//		                then().log().all().
//		                header("Server", equalTo("cloudflare")).
//		                body("Nel.report_to",equalTo("heroku-nel"))
		                ;
	}
}
