package BasicRestTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.ResponseOptions;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetPostValidation {


	@Test
	public void getAPiValidation()
	{
		baseURI="https://reqres.in/api";
		given()
		.log().all().get("users?page=2")
		.then().statusCode(200)
		.body("data[1].first_name", equalTo("Lindsay")).body("data.first_name", hasItems("Byron","George"));
		
	}
	
}
