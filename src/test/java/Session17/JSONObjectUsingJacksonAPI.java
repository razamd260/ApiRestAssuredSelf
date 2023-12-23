package Session17;

import java.util.Iterator;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class JSONObjectUsingJacksonAPI {
    @Test
	public void test01() {
    	ObjectMapper mapper=new ObjectMapper();
    	ObjectNode userdetails=mapper.createObjectNode();
    	userdetails.put("firstName", "Prerna");
    	userdetails.put("lastName", "Gupta");
    	userdetails.put("age",28 );
    	userdetails.put("salary",10000.56 );
    	ObjectNode skills=mapper.createObjectNode();
    	skills.put("Language", "JAVA");
    	skills.put("WebAutomation", "Selenium");
    	userdetails.put("TechSkill", skills);
    	try {
			String print=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userdetails);
		    System.out.println(print);
    	} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	String firstname=userdetails.get("firstName").asText();
    System.out.println(firstname);
    String WebAutomationValue = userdetails.get("TechSkill").get("WebAutomation").asText();
   System.out.println(WebAutomationValue);
   
  System.out.println("---------------PrintAll FieldName----------------");
    Iterator<String> itr1=userdetails.fieldNames();
    while(itr1.hasNext()) {
    	System.out.println(itr1.next());
    }
    
    System.out.println("---------------PrintAll FieldValue----------------");
    Iterator<JsonNode> itr2=userdetails.elements();
    while(itr2.hasNext()) {
    	System.out.println(itr2.next());
    }
    
    
    System.out.println("---------------PrintAll Field--------------------");
    Iterator<Entry<String, JsonNode>> itr3=userdetails.fields();
    while(itr3.hasNext()) {
    	Entry<String,JsonNode> node=itr3.next();
    	System.out.println("Key: "+node.getKey()+" : "+"Value : "+node.getValue());
    }
    /*
     * Remove value
     */
   String removevalue =userdetails.remove("firstName").asText();
  System.out.println("Remove value : -"+removevalue);
  /*
   * updates
   */
  
  userdetails.put("sex", "male");
  skills.put("Mechanical", "Tom");
  userdetails.put("TechSkill", skills);

	try {
		String print=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(userdetails);
	    System.out.println(print);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
    
	RestAssured rest=new RestAssured();
    RequestSpecification req=rest.given();
    req.baseUri("https://reqres.in/api/users").
    contentType(ContentType.JSON).
    body(userdetails).
    post().
    then().statusCode(201).log().all();
    
    
    }
   
}
