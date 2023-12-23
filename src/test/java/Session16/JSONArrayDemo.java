package Session16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONArrayDemo {
    @Test (enabled=true)  
	public void test01() {
		RestAssured rest=new RestAssured();
		RequestSpecification req=rest.given();
		JSONArray jsonarr=new JSONArray();
		jsonarr.add("MD SIKANDER ANSARI");
		jsonarr.add("Intelegent Men");
		jsonarr.add("He Is Good Person");
		Map<String,Object> obj1=new HashMap<String ,Object>();
		obj1.put("id", 1);
		obj1.put("name", "MOHAMMAD");
		obj1.put("job", "FEATER");
		Map<String,Object> obj2=new HashMap<String ,Object>();
		obj2.put("id", 2);
		obj2.put("name", jsonarr);
		obj2.put("job", "FEATER");
		Map<String,Object> obj3=new HashMap<String ,Object>();
		obj3.put("id", 3);
		obj3.put("name", "ANSARI");
		obj3.put("job", "FEATER");
		ArrayList<Map<String,Object>> arr=new ArrayList<>();
		arr.add(obj1);
		arr.add(obj2);
		arr.add(obj3);
		
		
		
		Response response=req.baseUri("https://reqres.in/").
		basePath("api/users").
		header("Content-Type","application/json").
		contentType(ContentType.JSON).body(arr).post();
		//response.prettyPrint();
	    System.out.println(response.asPrettyString());
    }


}