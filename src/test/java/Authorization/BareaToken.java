package Authorization;

import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class BareaToken {
     
	@Test
	public void test01() {
		
		
		String AuthToken = "Bearer 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";
		
		given().baseUri("https://api.github.com/user/repos").auth().oauth2("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").contentType(ContentType.JSON).
		
		    when().get().
		    
		           then().log().all();
	}
}
