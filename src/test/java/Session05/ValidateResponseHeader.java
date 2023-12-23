package Session05;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import junit.framework.Assert;

public class ValidateResponseHeader {
	@Test
	public void test01() {
		RestAssured rest = new RestAssured();
		rest.baseURI = "https://reqres.in";
		rest.basePath = "/api/users/2";
		Response response = rest.get();
		String transfer = response.header("Transfer-Encoding");
		System.out.println(response);
		Headers list = response.getHeaders();
		for (Header e : list) {
			System.out.println(e.getName()+"   "+ e.getValue());
		}
		Assert.assertEquals(transfer, "chunked");

	}
}
