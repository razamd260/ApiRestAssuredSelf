package HandleCookies;

import static io.restassured.RestAssured.given;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class A1 {
    
	@Test
	public void test01() {
		
		Response res=given().baseUri("https://www.google.com/").
		when().get();
		Map<String,String> cookies=res.getCookies();
		
		for(String k:cookies.keySet()) {
			String value=res.getCookie(k);
			System.out.println(k+" : "+value);
		}
	}
}
