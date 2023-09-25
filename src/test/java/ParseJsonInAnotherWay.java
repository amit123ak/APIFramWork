import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ParseJsonInAnotherWay {
	
	
	@Test
	public  void parseJsonSway()
	{
		
		
		RequestSpecification resp= RestAssured.given();
		resp.baseUri("https://reqres.in");
		resp.basePath("/api/users");
		resp.queryParam("page", 2);
	Response response=  resp.get();
	  
	
	  
	  System.out.println("Get First Array zeop"+ response.jsonPath().getList("data").get(0));
	  
	  System.out.println("id ="+ response.jsonPath().getMap("data[0]").get("id"));
	  
	  System.out.println("email  =" + response.jsonPath().getMap("data[0]").get("email"));
	  
	  System.out.println("Get Support url  = " + response.jsonPath().getMap("support").get("url"));
	  
	  
	  System.out.println("page =" +response.jsonPath().getInt("page"));
	  System.out.println("per_page =" +response.jsonPath().getInt("per_page"));
	  
	  
	  
		
		
	}

}
