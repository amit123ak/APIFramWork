package Handing.Cokkies.RestAssured;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class HandleCokies {

	public Map<String,String> cokies;
	@Test
	public void CookiesData()
	{
		cokies= new HashMap<String,String>();
		
		cokies.put("cokkies1", "THis cookies added ");
		cokies.put("cokkies2", "this is Second Cookies");
		cokies.put("cokkies3", "This is Third cookies");
		cokies.put("cokkies4", " this is forth cookies ");
	}
	
	@Test(dependsOnMethods="CookiesData")
	public void CokkiesTest()
	{
		RestAssured.given().log().all()
		.baseUri("http://postman-echo.com")
		.basePath("/cookies/set")
		.cookie("hello","this is my first cookies")
		.cookies(cokies)
		.when()
		.get().then().assertThat().statusCode(200);
		
		
	}
	
	
}
