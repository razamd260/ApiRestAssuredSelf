package Session03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

  
  public class DeleteMethod {
	@Test
	  public void test01() {
		  RestAssured rest=new RestAssured();
		  rest.baseURI="https://reqres.in/api/users/2";
		  RequestSpecification req=rest.given().header("Content-Type","application/json").contentType(ContentType.JSON);
		  System.out.println("Response Code :- "+req.get().statusCode());
		  rest.when().delete().
		  then().statusCode(204).
		        log().all();
	  }
	@Test
	public void testcode01() {
		
			RestAssured.baseURI="https://reqres.in/api/users/52";
			RestAssured.given().
			when().
				delete().
			then().
				log().all().
				statusCode(204);
		
	}
}
