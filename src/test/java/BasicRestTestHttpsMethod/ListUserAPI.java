package BasicRestTestHttpsMethod;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.ResponseOptions;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class ListUserAPI {
	
	@Test
	public void Test1()
	{
		ResponseOptions response=	get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		
		System.out.println(response.contentType());
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("Content-Type"));
		
	}
	     @Test
         public void Test2()
         {
        	  baseURI="https://reqres.in";
        	  
        	 given().get("/api/users?page=2")
        	 .then().statusCode(200).body("data[1].id", equalTo(8));
        	 
         }
}
