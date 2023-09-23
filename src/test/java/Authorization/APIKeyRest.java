package Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class APIKeyRest {
	
	@Test
	public void weither()
	{
		RequestSpecification spec=RestAssured.given();
		 spec.baseUri("https://api.openweathermap.org");
		 spec.basePath("/data/2.5/weather");
		 spec.queryParam("lat", "44.34");
		 spec.queryParam("lon", "10.99");
		 spec.queryParam("appid", "4ee397a18950f87aef155df21c70a722");
		Response response= spec.get();
		
	
		
		Assert.assertEquals(response.statusCode(), 200);
		
		System.out.println("Status line"+ response.statusLine());
		System.out.println("body"+ response.getBody().asPrettyString());
		
		
		
	}

}
