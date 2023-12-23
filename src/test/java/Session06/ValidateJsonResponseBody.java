package Session06;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidateJsonResponseBody {
   @Test
	public void test01() {
		baseURI="https://reqres.in/";
		basePath="api/users?page=1";
		Response response=get();
		//System.out.println(response.getBody());
		String Wo=response.asPrettyString();
		System.out.println(Wo);
		Assert.assertEquals(Wo.contains("Janet"), true);
		JsonPath json =response.jsonPath();
		//System.out.println(json);
	    String	firstname=json.get("data[0].first_name");
		System.out.println(firstname);
		
		
	}
   //only page then we use data[0] not data.  //ClassCastException
   @Test
   public void test02() {
	  RestAssured rest=new RestAssured();
	  RequestSpecification req=rest.given();
	  req.baseUri("https://reqres.in/");
	  req.basePath("api/users");
	  req.queryParam("page", 2);
	  Response response=req.get();
	  System.out.println(response.asPrettyString());
      JsonPath json=response.jsonPath();
      String firstname=json.get("data[0].first_name");
      System.out.println(firstname);
   }
   
   @Test
   public void test03() {
	   RestAssured rest=new RestAssured();
		  RequestSpecification req=rest.given();
		  req.baseUri("https://reqres.in/");
		  req.basePath("api/users");
		  req.queryParam("page", 2).queryParam("id", 8);
		  Response response=req.get();
		  System.out.println(response.asPrettyString());
	      JsonPath json=response.jsonPath();
	      String firstname=json.get("data.avatar");
	      System.out.println(firstname);
   }
}
