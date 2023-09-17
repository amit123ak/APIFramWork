package BasicRestTest;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class ListUserAPI {
	
	public static void main(String[] args) {
	ResponseOptions response=	RestAssured.get("https://reqres.in/api/users?page=2");
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	
	System.out.println(response.contentType());
	
	System.out.println(response.getBody().asString());
	
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("Content-Type"));
	
	
	
		
	}

}
