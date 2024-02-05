package ValidateApproch;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class FirstApproch {
	@Test
     public void test01() {
    	 
		given().baseUri("https://reqres.in/").basePath("api/users").queryParam("page", 2).contentType(ContentType.JSON).
		   when().get().
		       then().statusCode(200).
		           body("page", equalTo(2)).
		           body("data[1].id", equalTo(8)).
		           header("Via", equalTo("1.1 vegur")).
		           log().all();
     }
}
