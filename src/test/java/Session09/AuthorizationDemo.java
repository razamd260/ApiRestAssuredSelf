package Session09;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationDemo {
   @Test(enabled=true)
   public void test01() {
	   RestAssured rest=new RestAssured();
	   RequestSpecification req=rest.given();
	   req.baseUri("https://gorest.co.in").basePath("/public/v2/users");
	   JSONObject json=new JSONObject();
	   json.put("name", "MD NOUSHAD ANSARI");
	   json.put("gender", "Male");
	   json.put("email", "razamd260@gmail.com");
	   json.put("status", "Active");
	   String BearerToken="Bearer cc61e6293dbe2bc5716f8992337bab7932f06e666a79b11675d63b110875ef73";
	   Response response=req.header("Authorization", BearerToken).contentType(ContentType.JSON).body(json.toString()).post();
	   System.out.println(response.asString());
   }
   @Test
   public void test02() {
	   RestAssured rest=new RestAssured();
	   Response response=rest.get("https://gorest.co.in/public/v2/users");
	   System.out.println(response.asString());
   }
}
