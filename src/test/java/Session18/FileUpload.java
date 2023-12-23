package Session18;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class FileUpload {
	@Test(enabled=false)
	public void test01() {
		String img="C:\\Users\\hii\\OneDrive\\Desktop\\salman-khan_9.jpg";
		File file=new File(img);
       RestAssured rest=new RestAssured();
       RequestSpecification req =rest.given();
       Response response=req.baseUri("http://httpbin.org/post").multiPart(file).contentType("multipart/form-data").post();
       response.prettyPrint(); 
	}

	@Test
	public void test02() {
		String img="C:\\Users\\hii\\OneDrive\\Desktop\\Excel\\SQL pdf.pdf";
		File file=new File(img);
       RestAssured rest=new RestAssured();
       RequestSpecification req =rest.given();
       Response response=req.baseUri("http://httpbin.org/post").multiPart(file).contentType("multipart/form-data").post();
     // System.out.println(response.asPrettyString()); 
       Assert.assertEquals(200, response.getStatusCode());
	}
}
