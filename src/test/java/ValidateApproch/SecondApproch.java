package ValidateApproch;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

public class SecondApproch {
     @Test
	 public void test01() {
    	 
			Response res=given().baseUri("https://reqres.in/").basePath("api/users").queryParam("page", 2).contentType(ContentType.JSON).
			   when().get();
			   JsonPath json=res.jsonPath();
			   System.out.println(json.get("page").toString());
			   System.out.println(json.get("per_page").toString());
			   System.out.println(json.get("total").toString());
			   System.out.println(json.get("total_pages").toString());
			 
			   System.out.println("----------------------Array start----------------");
			   
			   System.out.println(json.get("data[0].id").toString());
			   System.out.println(json.get("data[0].email").toString());
			   System.out.println(json.get("data[0].first_name").toString());
			   System.out.println(json.get("data[0].last_name").toString());
			   System.out.println(json.get("data[0].avatar").toString());
			  
	     
             
     
     
     
    

     }
}
