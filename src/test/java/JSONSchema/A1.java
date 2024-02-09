package JSONSchema;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import org.testng.annotations.Test;

public class A1 {
     @Test
	public void test01() {
		
    	 given().
    	 
    	     when().get("https://reqres.in/api/users").
    	     
    	          then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("V.json"))
    	          
    	          .log().all();
    	 
	}
}
