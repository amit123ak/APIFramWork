package Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuthentication {

	@Test

	public void BasicAuthent()
	{
		RequestSpecification spec=RestAssured.given();
		spec.baseUri("https://postman-echo.com");
		spec.basePath("/basic-auth");
	   
		spec.auth().basic("postman", "password");
		Response response =spec.get();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println("Status  line "+ response.statusLine());
		System.out.println("Status  line "+ response.statusCode());
		System.out.println("body " + response.body().asPrettyString());
		
	}
	}