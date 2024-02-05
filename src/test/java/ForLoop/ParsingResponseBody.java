package ForLoop;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingResponseBody {
	@Test
       public void test01() {
		
    	   Response res=given().baseUri("https://reqres.in/").basePath("api/users").queryParam("page", 2).
    			   contentType(ContentType.JSON).
    	     when().get();
    	   //res.then().log().all();
    	       
    	   JSONObject jo=new JSONObject(res.asString());
    	   for(int i=0;i<jo.getJSONArray("data").length();i++) {
    		   String listfirstname=jo.getJSONArray("data").getJSONObject(i).get("email").toString();
    		   System.out.println(listfirstname);
    	   }
    	   
    	   boolean status=false;
    	   for(int i=0;i<jo.getJSONArray("data").length();i++) {
    		   String listfirstname=jo.getJSONArray("data").getJSONObject(i).get("email").toString();
    		  if(listfirstname.equals("rachel.howell@reqres.in")){
    			  status=true;
    			  break;
    		  }
    	   }
       Assert.assertTrue(status);
	}
}
