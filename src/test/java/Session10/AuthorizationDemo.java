package Session10;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class AuthorizationDemo {

	
	@Test
	public void test01() {
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("https://api.openweathermap.org").
		basePath("/data/2.5/weather").
		queryParam("q", "delhi").
		queryParam("appid", "f6008b5be64d452d894a8075fb34022d");
		Response response=req.get();
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println(response.asPrettyString());
		
	}
}
