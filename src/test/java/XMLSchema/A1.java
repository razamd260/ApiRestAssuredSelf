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

public class A1 {
     @Test
	public void test01() {
		given().
		
		     when().get("http://restapi.adequateshop.com/api/traveler").
		      
		           then()
		           .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("X.xsd")).
		                log().all();
	}
}
