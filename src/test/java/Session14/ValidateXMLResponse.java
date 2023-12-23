package Session14;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateXMLResponse {

	@Test
	public void test01() {
		String json="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		RestAssured rest = new RestAssured();
		RequestSpecification req = rest.given();
		req.baseUri("https://petstore.swagger.io");
		req.basePath("/v2/pet");
		req.header("accept", "application/json");
		req.header("Content-Type", "application/json").body(json);
		Response response=req.post();
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		
	}
}
