package PracticeCrudOperation;


import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;


public class PracticeMathod {
	@Test
     public void test01() {
		String path="api/users";
		Response res=given().contentType(ContentType.JSON).//pathParam("path", path).
		
		    when().get("https://reqres.in/api/users");
		   
		        ResponseBody body=res.getBody();
		        System.out.println(body.asPrettyString());
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	
		        
		      
		            
		
		
     }

	}

