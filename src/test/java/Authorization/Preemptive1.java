package Authorization;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Preemptive1 {
	@Test
	public void test01() {
        given().baseUri("http://postman-echo.com/").basePath("basic-auth").auth().preemptive().basic("postman", "password").
        
           when().get().
           
                 then().log().all();
	}
}
