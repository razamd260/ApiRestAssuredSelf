package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostMethod {
    @Test(enabled=false)
	public void test01() {
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("name", "Noushad");
		jsonobject.put("job", "QA");
		RestAssured rest=new RestAssured();
		rest.baseURI="https://reqres.in/api/users";
		rest.given().
		header("Content-type","appliation/json").
		contentType(ContentType.JSON).
		body(jsonobject.toJSONString()).
		when().post().
		then().statusCode(201).log().all();
		System.out.println("------------------------------");
}
   
    @Test
	public void testcode01()
	{
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Prachi");
		jsonData.put("job", "QA");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-type","application/json").
        contentType(ContentType.JSON).
        body(jsonData.toJSONString()).
        when().post().
        then().statusCode(201).log().all();
		

	}
}