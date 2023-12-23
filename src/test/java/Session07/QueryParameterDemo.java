package Session07;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryParameterDemo {

	@Test
	public void test01() {
		RestAssured rest = new RestAssured();

		RequestSpecification req = rest.given();
		req.baseUri("https://reqres.in");
		req.basePath("/api/users");
		req.queryParam("page", 2);
		
		QueryableRequestSpecification queryreq = SpecificationQuerier.query(req);
		System.out.println(queryreq.getURI());// complete URI
		System.out.println(queryreq.getBaseUri() + queryreq.getBasePath());
        Headers list=queryreq.getHeaders();
        for(Header h:list) {
        	System.out.println(h.getValue());
        }
        Response response=req.get();
        System.out.println(response.asPrettyString());
		JsonPath jsonpath=response.jsonPath();
		String firstname=jsonpath.get("data[0].first_name");
		System.out.println(firstname);
	}
}
