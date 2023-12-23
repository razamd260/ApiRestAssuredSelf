package Session19;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {
	@Test
	public void post() {
		JSONObject obj=new JSONObject();
		obj.put("id", 5);
		obj.put("name", "MD SAJAD");
		obj.put("job", "CONTRACTOR");
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("http://localhost:3000/users").contentType(ContentType.JSON).body(obj);
	    Response response=req.post();
	    System.out.println(response.asPrettyString());
	}
}
