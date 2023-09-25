import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;

public class JsonSchemaValidationTestTest {
  @Test
  
 	public void jsonSchemaValidator()
 	{
      RestAssured.given()
 		.baseUri("https://reqres.in")
 		.when().log().all()
 		.get("/api/users/2")
 	   .then().assertThat()
 		.statusCode(200)
 		//.body("first_name", Matchers.equalTo("Janet"))
 		//.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("D:\\ApiWorkspace\\APIFramWork\\src\\test\\resources\\schema.json"));
 		.body(JsonSchemaValidator.matchesJsonSchema(new File("D:\\ApiWorkspace\\APIFramWork\\src\\test\\resources\\schema.json")));
 		

 	
// System.out.println(payload);
 		
 		
 		
 	}
}
