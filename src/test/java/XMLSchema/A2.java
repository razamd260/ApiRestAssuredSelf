package XMLSchema;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;

import org.testng.annotations.Test;

public class A2 {
       @Test
       public void test01() {
    	   given().
   		
		     when().get("https://reqres.in/api/users?page=2").
		      
		           then()
		           .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("X1.xsd")).
		                log().all();
       }
}
