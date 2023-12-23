package Session19;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteMethod {

	@Test
	public void test01() {
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("http://localhost:3000/users/5").contentType(ContentType.JSON).when().delete();
	Response response=req.get();
	System.out.println(response.statusCode());
	}
}
