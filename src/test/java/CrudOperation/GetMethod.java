package CrudOperation;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetMethod {
     
	@Test(enabled =true)
	public void test01() {
		System.out.println("------------------validate data --------------------------");
		given().baseUri("https://reqres.in/").basePath("api/users/").queryParam("page", 2)
		     .when().get()
		.then().
		body("support.url",equalTo( "https://reqres.in/#support-heading")).
		body("page", equalTo(2)).
		body("per_page", equalTo(6)).
		body("total", equalTo(12)).
		body("total_pages", equalTo(2)).
		
		body("data[0].id",equalTo(7)).
		body("data[0].email",equalTo("michael.lawson@reqres.in")).
		body("data[0].first_name",equalTo( "Michael")).
		body("data[0].last_name",equalTo( "Lawson")).
		body("data[0].avatar",equalTo("https://reqres.in/img/faces/7-image.jpg")).
		
		body("data[1].id",equalTo(8)).
		body("data[1].email",equalTo("lindsay.ferguson@reqres.in")).
		body("data[1].first_name",equalTo( "Lindsay")).
		body("data[1].last_name",equalTo( "Ferguson")).
		body("data[1].avatar",equalTo("https://reqres.in/img/faces/8-image.jpg")).
		
		statusCode(200).log().all();
		 
	}
	
	
	
	@Test
	public void test02() {
		System.out.println("-------------------------Perform For Fetch data------------------");
		
		String n=given().baseUri("https://reqres.in/").basePath("api/users/").queryParam("page", 2)
	     .when().get().jsonPath().getString("data[0].email");
	     System.out.println(n); 
	  
	}
}
