package Header;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersCheck {
     
	@Test
	public void test01() {
		Response res=given().baseUri("https://www.google.com/").
				when().get();
		Headers header=res.getHeaders();
		
	  for(Header h:header) {
		System.out.println(h.getName() +" : "+h.getValue());
	 }

	}
}
