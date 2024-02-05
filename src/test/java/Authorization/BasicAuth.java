package Authorization;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BasicAuth {
	@Test
	public void test01() {
         given().baseUri("http://postman-echo.com/").basePath("basic-auth").auth().basic("postman", "password").
         
            when().get().
            
                  then().log().all();
	}
}
