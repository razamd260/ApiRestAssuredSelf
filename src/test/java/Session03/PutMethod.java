package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {

	public void test01() {
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("name", "ANSARI");
		jsonobject.put("job", "ENGG");
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given().header("Content-Type","application/json").contentType(ContentType.JSON).body(jsonobject.toString());
		Response response=req.get();
		int code=response.statusCode();
		System.out.println("Status Code :- "+code);
		rest.when().put().
		then().statusCode(200).
		log().all();
		
	}
	@Test
	public void testcode()
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
