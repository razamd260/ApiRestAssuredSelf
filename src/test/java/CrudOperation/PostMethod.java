package CrudOperation;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class PostMethod {
    
	@Test
	public void test01() {
		JSONObject json=new JSONObject();
		json.put("name", "NOUSHAD");
		json.put("job", "QA");
		
		given().baseUri("https://reqres.in/").basePath("api/users").contentType(ContentType.JSON).body(json).
		
		when().post().
		
		then().log().all();
		
	}
}
