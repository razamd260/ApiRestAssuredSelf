package Practice;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A {
	@Test
	public void test01() {
		//baseURI = "https://reqres.in/api/users/3";
		
	    
	      JSONObject child1=new JSONObject();
	      child1.put("id", 7);
	      child1.put("email", "michael.lawson@reqres.in");
	      child1.put("first_name", "Michael");
	      child1.put("last_name", "Lawson");
	      
	      JSONObject child2=new JSONObject();
	      child2.put("id", 8);
	      child2.put("email", "lindsay.ferguson@reqres.in");
	      child2.put("first_name", "Lindsay");
	      child2.put("last_name", "Ferguson");
	      
	      JSONObject child3=new JSONObject();
	      child3.put("id", 9);
	      child3.put("email", "tobias.funke@reqres.in");
	      child3.put("first_name", "Tobias");
	      child3.put("last_name", "Funke");
	   
	   ArrayList<Object> arr=new ArrayList<Object>();
	   arr.add(child1);
	   arr.add(child2);
	   arr.add(child3);
	
	   JSONObject support=new JSONObject();
	   support.put("url", "https://reqres.in/#support-heading");
	   support.put("text", "To keep ReqRes free, contributions towards server costs are appreciated!");
	
	   JSONObject parent=new JSONObject();
	   parent.put("page", 2);
	   parent.put("per_page", 6);
	   parent.put("total", 12);
	   parent.put("total_pages", 2);
	   parent.put("user", arr);
	   parent.put("support", support);
	  
	
	    RestAssured rest=new RestAssured();
		   RequestSpecification req=rest.given();
		   req.baseUri("https://reqres.in/").
		   basePath("api/users").
		   header("Content-Type","application/json").
		   contentType(ContentType.JSON).body(parent);
		   Response response=req.post();
		   response.prettyPrint();
	  
	}
}
