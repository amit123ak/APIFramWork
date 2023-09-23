package Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Oth2 {
	
	public static String access_token;
	
	@Test
	public void ToGetToken()
	{
		RequestSpecification spec=RestAssured.given();
		
		spec.baseUri("https://api-m.sandbox.paypal.com");
		spec.basePath("/v1/oauth2/token");
		
		String Client_ID ="ATcPtnnIp38TeOhWYcgvYqiMs9RSn1nb2mKcenTAe4kR8jkBOHAr9Jc-3_hF7v2HHpv-nAzxke3WM7gH";
		String Secret ="ELC-EifTziMNTfKxFUVPDm_xiQcmTdPFhT8WPEGeg4jRwJyKHym9UaW43MUOMTmggWTahRjeiEDe9Ds1";
		spec.queryParam("grant_type", "client_credentials");
		spec.auth().preemptive().basic(Client_ID, Secret);
		
		Response response =spec.post();
		
		Assert.assertEquals(response.statusCode(), 200,"check status code");
		
		System.out.println("Status line" + response.statusLine());
	    response.prettyPrint();
	    
	    access_token= response.getBody().path("access_token");
	    System.out.println("======================================================");
	    
	    System.out.println(access_token);
	     
		
		}
	
	
	
	
	
	
	
	@Test(dependsOnMethods="ToGetToken")
	 public void GetItemsList()
	 {
		 RequestSpecification spec=RestAssured.given();
		 String Bearer="Bearer "+access_token;
		 System.out.println(Bearer);
		 
		 spec.baseUri("https://api-m.sandbox.paypal.com");
		 spec.basePath("/v1/invoicing/invoices");
		 spec.queryParam("page", 3);
		 spec.queryParam("page_size", 4);
		 spec.queryParam("total_count_required", "true");
		 spec.headers("Authorization", Bearer);
		Response response= spec.get();
		
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println("stats line"+ response.statusLine());
		
		response.prettyPrint();
		
		
		 
		 
	 }
	
	
}
