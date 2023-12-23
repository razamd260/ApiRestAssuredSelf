package Session19;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
     
	@Test
	public  void main() {
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("http://localhost:3000/users").contentType(ContentType.JSON);
		Response response=req.get();
		System.out.println(response.asPrettyString());
	}
}
