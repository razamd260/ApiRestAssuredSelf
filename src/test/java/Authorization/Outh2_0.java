package Authorization;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Outh2_0 {
	@Test
	public void test01() {

		String AuthToken = "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";

		given().baseUri("https://api.github.com/user/repos")
				.auth().oauth2("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").

				when().get().

				then().log().all();
	}
}
