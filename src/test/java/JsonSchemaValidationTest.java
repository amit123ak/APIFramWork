import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationTest {

	
	
    @Test
   
	public void jsonSchemaValidator()
	{
		
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.when()
		.get("/api/users/2")
		.then().assertThat()
		.statusCode(200)
		.body("first_name", Matchers.notNullValue())
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json")).log().all();
		
		
		
	}
}
