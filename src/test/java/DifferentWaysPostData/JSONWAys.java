package DifferentWaysPostData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JSONWAys {
      
	@Test
	public void test01() throws FileNotFoundException {
		File f=new File("G:\\SDETQA\\data.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject data=new JSONObject(jt);
		
		given().baseUri("https://reqres.in/").basePath("api/users").contentType(ContentType.JSON).body(data.toString()).
		
		when().post().
		
		then().statusCode(201).log().all();
		
		
	}
}
