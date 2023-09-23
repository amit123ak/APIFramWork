package Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class DigestAuth {
	
	@Test
	public void DigestAuth()
	{
		RequestSpecification spec=RestAssured.given();
		
		spec.baseUri("http://httpbin.org/");
		spec.basePath("digest-auth/undefined/amit/amit");
		spec.auth().digest("amit", "amit").log().all();
	    Response response=	spec.get();
	    Assert.assertEquals(response.statusCode(), 200,"check Status code");
	    
	    System.out.println("Print Status Line"+ response.statusLine());
	    
	    System.out.println("print body "+ response.body().asPrettyString());
	   
	
	
		
		
		
	}

}
