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
		 given()
			.queryParam("appid", "f6008b5be64d452d894a8075fb34022d").when().
			   
			   get("https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7").
			
			     then().log().all();
			
	 }
}
