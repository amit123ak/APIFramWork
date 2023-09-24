package ResponseSpecbuilder;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecBuilderTest {
	
	ResponseSpecification responseSpec=null;
	
	@BeforeClass
	public void RestSpecBuilderTest()
	{
		
	ResponseSpecBuilder resSpec=new ResponseSpecBuilder();
	resSpec.expectStatusCode(200);
	resSpec.expectStatusLine("HTTP/1.1 200 OK");
	resSpec.expectContentType(ContentType.JSON);
	resSpec.expectResponseTime(Matchers.lessThan(2000L));
	
	responseSpec=resSpec.build();
	
	
	}	
	
	
	@Test
	public void SingleUser()
	{
		RestAssured.given()
		.baseUri("https://reqres.in/api/users/2")
		.when().get()
		.then().spec(responseSpec);
		/*
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L));
		*/
		
	}
	
	
	@Test
	public void ListUser()
	{
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.queryParam("page", 2)
		.when().get()
		.then()
		.spec(responseSpec);
		/*
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L));
		*/
		
	}
	
	

}
