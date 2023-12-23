package Session19;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PatchMethod {
    
	@Test
	public void test01() {
		JSONObject obj1=new JSONObject();
		obj1.put("Date till Now", "He Is Good Person But Only for Own Faimly Not For Me not Bcz He Didn't Support me bcz ?");
		JSONObject obj=new JSONObject();
        obj.put("Story",obj1 );
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("http://localhost:3000/users/4").contentType(ContentType.JSON).body(obj).when().patch();
	    Response resposne=req.get();
	    System.out.println(resposne.asPrettyString());
	}
}
