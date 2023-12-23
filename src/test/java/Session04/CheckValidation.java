package Session04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CheckValidation {
   
	@Test
	public void test01() {
		RestAssured rest=new RestAssured();
		rest.baseURI="https://reqres.in/api/users/2";
		RequestSpecification req=rest.given().header("Content-Type","application/json").contentType(ContentType.JSON);
	    Response response=req.get();
	    System.out.println("String :- "+response.statusLine());
	    String statusline=response.statusLine();
	    int statuscode=response.statusCode();
	    Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	    Assert.assertEquals(statuscode, 200);
	}
	
	@Test
	public void test02() {
		RestAssured rest=new RestAssured();
		rest.baseURI="https://reqres.in/api/users/2";
		RequestSpecification req=rest.given();
		Response response=req.get();
		ValidatableResponse validate=response.then();
	    validate.statusCode(200);
	    validate.statusLine("HTTP/1.1 200 OK");
	}
	
	@Test
   public void test03() {
	 RestAssured rest=new RestAssured();
	 rest.baseURI="https://reqres.in/api/users/2";
	 rest.given().then().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
  }

}
