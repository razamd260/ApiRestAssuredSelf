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
		
		
		String AuthToken ="Bearer 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";
		
		given().baseUri("https://api.github.com/user/repos").headers("Authorization","Bearer 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").
		
		    when().get().
		    
		           then().log().all();
	}
}
