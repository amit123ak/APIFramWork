package JSonParserPakage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.*;

public class ParsedJsonResponseUsingJsonPathFunction {
     public static RequestSpecification resp=null;
	
	@Test
	public void RequestBuikder()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		
		req.setBaseUri("https://run.mocky.io");
	
		req.setBasePath("/v3/9cc279c5-67f2-4e29-8ab6-eb9b801fe8b4");
		
		
		resp=req.build();
		
		
		 }
	
	@Test(dependsOnMethods="RequestBuikder")
	public void GetTestAPI()
	{
     Response re=   RestAssured.given()
		.spec(resp).when()
		.get();
	
	System.out.println("print"+ re.jsonPath().prettify());
	System.out.println("========================================================");
	
         // re.jsonPath().getList("store.book").get(0);
          List<LinkedHashMap<String,Object>>map= (List<LinkedHashMap<String, Object>>) re.jsonPath().getList("store.book").get(0);
	
	     		
	
	System.out.println(map);
	
		
	}
	
	
	
}
