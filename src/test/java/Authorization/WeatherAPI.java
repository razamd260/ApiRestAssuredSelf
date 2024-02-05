package Authorization;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class WeatherAPI {
    
	@Test
	 public void test01() {
		 RequestSpecification requestSpec = RestAssured.given();
			requestSpec.baseUri("https://api.openweathermap.org");
			requestSpec.basePath("/data/2.5/weather");
			requestSpec.queryParam("city name", "delhi").queryParam("appid", "f6008b5be64d452d894a8075fb34022d");
			requestSpec.get().then().log().all();
			
	 }
}
