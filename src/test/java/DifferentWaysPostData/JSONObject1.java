package DifferentWaysPostData;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JSONObject1 {
@Test
public void test01() {
		
		HashMap<String, String> map=new HashMap<String, String>();
	    map.put("name", "NOUSHAD");
	    map.put("job", "QA");
		
		given().baseUri("https://reqres.in/").basePath("api/users").contentType(ContentType.JSON).body(map).
		
		when().post().then().log().all();
	}
	
}
