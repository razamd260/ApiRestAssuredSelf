package Session08;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {

	@Test
	public void BasicAuth() {
		RestAssured rest = new RestAssured();
		RequestSpecification req = rest.given();
		req.baseUri("http://postman-echo.com").basePath("/basic-auth");
		req.auth().preemptive().basic("postman", "password");
		Response response = req.get();
		System.out.println(response.asPrettyString());
	}

	@Test
	public void DigestAuth() {
       RestAssured rest=new RestAssured();
       RequestSpecification req=rest.given();
       req.baseUri("http://httpbin.org").basePath("/digest-auth/undefined/noushad/noushad/MD5");
       Response response=req.auth().digest("noushad", "noushad").get();
	   System.out.println(response.statusLine());
	}
}
