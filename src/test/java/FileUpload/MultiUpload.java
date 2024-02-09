package FileUpload;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class MultiUpload {
	@Test
	public void test01() {
		/*
		 * Site change but multiple file we can upload only single write file and  multiple write files
		 */
		
		File file1=new File("C:\\Users\\hii\\OneDrive\\Desktop\\3.4\\E SOFT 3.pdf");
		File file2=new File("C:\\Users\\hii\\OneDrive\\Desktop\\3.4\\E SOFT 3.docx");
    	   given().multiPart("files", file1).multiPart("files", file2).contentType("multipart/form-data").
    	   
		
    	        when().post("https://petstore.swagger.io/v2/pet/1/uploadImage").
    	         
    	              then().log().all();
     }
}   