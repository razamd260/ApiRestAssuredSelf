package Session11;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuthorizationDemoOauth {
static String accessToken;
// url accecs token : https://api-m.sandbox.paypal.com/v1/oauth2/token
	@Test
	public void GetAccessToken() {
		String clientid ="AfSv8Tjx_8K_s_1WoAgX5MLGIQr1ge7jCzxXGHJJfesPi6MlGK0qCFc8lbgjCvZToU_8UMP44sdyTKuI";
	    String cliensecret = "EAmK-8LYfRfVUfJLJ9ssefYavQ2C_j21jxlqHMoU5OUpNQIf6ko2KZbpa1kDntWqZbqS01-aLySpn4gq";
		RestAssured rest=new RestAssured();
		RequestSpecification req =rest.given();
		req.baseUri("https://api-m.sandbox.paypal.com/");
		req.basePath("v1/oauth2/token")	;
		Response response=req.auth().preemptive().basic(clientid, cliensecret).param("grant_type", "client_credentials").post();
		System.out.println(response.prettyPrint());
		accessToken= response.getBody().path("access_token");
		System.out.println(accessToken);
		
	}
	

	@Test(dependsOnMethods ="GetAccessToken")
	public void ListInvoice()
	{
		//page=3&page_size=4&total_count_required=true
		Response res= RestAssured.given().auth().oauth2(accessToken).queryParam("page", "3")
		 .queryParam("page_size", "4")
		 .queryParam("total_count_required", "true")
		 .get("https://api-m.sandbox.paypal.com/v1/invoicing/invoices");
		
		System.out.println("\n------------------LIST INVOICE------------------------");
		
		res.prettyPrint();
		//print status code & status line
				System.out.println("Response code:" + res.statusCode() );
				System.out.println("status line:" + res.statusLine() );
		
				//validate repsonse code
				Assert.assertEquals(res.statusCode(), 200,"check for response code");
				
		
	}
	
//	@Test(dependsOnMethods ="GetAccessToken")
//	public void ListInvoice()
//	{
//		//page=3&page_size=4&total_count_required=true
//		RestAssured rest=new RestAssured();
//		RequestSpecification req1=rest.given();
//		req1.baseUri("https://api-m.sandbox.paypal.com/v1/invoicing/invoices");
//		
//				req1.auth().oauth2(accessToken).queryParam("page", "3")
//		 .queryParam("page_size", "4")
//		 .queryParam("total_count_required", "true");
//		Response response1=req1.get();
//		
//		System.out.println("\n------------------LIST INVOICE------------------------");
//		
//		response1.prettyPrint();
//		//print status code & status line
//				System.out.println("Response code:" + response1.statusCode() );
//				System.out.println("status line:" + response1.statusLine() );
//		
//				//validate repsonse code
//				Assert.assertEquals(response1.statusCode(), 200,"check for response code");
//				
//		
//	}




}
