package Session03;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	 RestAssured rest;
	@Test
	public void test01() {
      rest=new RestAssured();
      rest.baseURI="https://reqres.in/api/users/3";
      RequestSpecification req=rest.given().header("Content-Type","application/json").contentType(ContentType.JSON);
      Response response=req.get();
      System.out.println("Response Code :- "+response.statusCode());
      System.out.println(response.asPrettyString());
	}
	
	@Test
	public void test02() {
		rest=new RestAssured();
		Response response=rest.get("https://reqres.in/api/users?page=3");
		System.out.println("Response Code :- "+response.statusCode());
	}
	@Test
	public void testcode01()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response code:" + response.getStatusCode());
		System.out.println("Response body:" + response.getBody().asString());
		System.out.println("Response Time:" + response.getTime());
		System.out.println("Response Header:" + response.getHeader("Content-Type"));
		
		//validate status code
		//expected status code =200
		
		int expectedStatusCode = 200;
		int ActualStatuscode = response.getStatusCode();
		
		Assert.assertEquals(expectedStatusCode, ActualStatuscode);
		

		
	}
	
	@Test
	public void testcode02()
	{
		//given , when, then
		RestAssured. baseURI="https://reqres.in/api/users";
		RestAssured.given()
		.queryParam("page", "2")
		.when().get()
		.then().statusCode(208);
		
	}
	

}
