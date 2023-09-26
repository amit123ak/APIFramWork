package BasicRestTestHttpsMethod;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseOptions;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class PutPatchAndDeleteValidation {

	@Test
	public void PutApiValidation() throws JsonProcessingException
	
	{
	     Map<String,Object>map=new HashMap<>();
	     
	 	map.put("name", "AMIT");
		map.put("job", "zion resident"); 
		ObjectMapper objectmapper=new ObjectMapper();
		
	String json=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
	
	  baseURI="https://reqres.in";
	  given().log().all()
	  .header("Content-Type","application/json")
      .body(json)
      .when()
      .put("api/users/2")
      .then()
      .statusCode(200).log().all();
		
	     
		
	}
	
	@Test
	public void PatchAPiValidation() throws JsonProcessingException
	
	{
	     Map<String,Object>map=new HashMap<>();
	     
	 	map.put("name", "AMIT");
		map.put("job", "sr Automation"); 
		ObjectMapper objectmapper=new ObjectMapper();
		
	String json=objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
	
	  baseURI="https://reqres.in";
	  given().log().all()
	  .header("Content-Type","application/json")
      .body(json)
      .when()
      .patch("api/users/2")
      .then()
      .statusCode(200).log().all();
		
	     
		
	}
	
	@Test
	public void DeleteAPiValidation() throws JsonProcessingException
	
	{
		
	  baseURI="https://reqres.in";
	
      when()
      .delete("/api/users/2")
      .then()
      .statusCode(204).log().all();
		
	     
		
	}
	
}
