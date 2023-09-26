package BasicRestTestHttpsMethod;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseOptions;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

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
	@Test
	public void PostApiValidation() throws JsonProcessingException
	{
		Map<String,Object>map=new HashMap<>();
		
		map.put("name", "morpheus");
		map.put("job", "leader");
		ObjectMapper objectmapper=new ObjectMapper();
		String  json=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		//System.out.println("Hello");
		//System.out.println(json);
		
           
		baseURI="https://reqres.in/api";
		given().log().all()
		  .header("Content-Type","application/json")
		  .contentType(ContentType.JSON)
		  .accept(ContentType.JSON)
		  .body(json)
		  .when()
		  .post("/users")
		  .then().statusCode(201)
		  
		  .log().all();
	
		
	}
	
}
