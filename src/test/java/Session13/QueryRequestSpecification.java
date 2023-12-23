package Session13;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryRequestSpecification {
     
	@Test
	public void test01() {
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Rekha");
		jsonData.put("job", "QA");
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		req.baseUri("https://reqres.in").basePath("/api/users").queryParam("page", 2).header("content-Type","application/json").contentType(ContentType.JSON).body(jsonData.toString()).post();
		Headers header=req.get().getHeaders();
		  for(Header h:header) {
	        	System.out.println(h.getValue());
	        }
		QueryableRequestSpecification requestquery=SpecificationQuerier.query(req);
		System.out.println(requestquery.getURI());
		String body=requestquery.getBody();
		System.out.println(body);
		Headers header1=requestquery.getHeaders();
		  for(Header h:header1) {
	        	System.out.println(h.getValue());
	        }
	      
	
	}
	      
	
}
