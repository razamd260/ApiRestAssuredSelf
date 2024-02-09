package FileUpload;


import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class SingleUpload {
	@Test
     public void test01() {
    	   
		File file2=new File("C:\\Users\\hii\\OneDrive\\Desktop\\3.4\\E SOFT 3.docx");
		given().multiPart("file", file2).contentType("multipart/form-data").
    	        when().post("https://petstore.swagger.io/v2/pet/1/uploadImage").
    	         
    	              then().log().all();
     }
}
