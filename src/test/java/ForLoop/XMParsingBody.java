package ForLoop;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class XMParsingBody {
        @Test  
	public void test01() {
		Response res=given().baseUri("http://restapi.adequateshop.com/api/Traveler?page=1").contentType(ContentType.XML).
		
		when().get();
		
		XmlPath xmlobj=new XmlPath(res.asString());
	    List<String> travellers	=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation");
	    System.out.println(travellers.size());
	    
	    List<String> travellersemail=xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.email");
	    for(String t:travellersemail) {
	    	System.out.println(t);
	    }
	    
	 }
}
