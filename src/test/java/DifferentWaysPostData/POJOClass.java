package DifferentWaysPostData;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class POJOClass {
    
	@Test
	 public void test01() {
		POJODATA data=new POJODATA();
		data.setName("NOUSHAD");
		data.setJob("QA");
		String[] cource= {"c++","java"};
		data.setCource(cource);
		
		given().baseUri("https://reqres.in/").basePath("api/users").contentType(ContentType.JSON).body(data).
		
		when().post().
	   
	 
	   then().statusCode(201).log().all();
	}
}
