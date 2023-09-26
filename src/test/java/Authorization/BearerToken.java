package Authorization;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;

public class BearerToken {
	
	@Test
	public void bearerToken()
	
	
	{
		/*{ 
			"id": 53412,
			"name": "Amit kumar",
			"email": "amitkumar@qapro.com",
			"gender": "male",
			"status": "active"
			}*/
	
		RequestSpecification spec=RestAssured.given();
		
		spec.baseUri("https://gorest.co.in");
		spec.basePath("/public/v2/users");
		
		JSONObject payload=new JSONObject();
		
		payload.put("id", 53412);
		payload.put("name", "Amit kumar Gond");
		payload.put("email", "amitgondQA@gmail.com");
		payload.put("gender", "Male");
		payload.put("status", "active");
		System.out.println(payload.toJSONString());
		String Token="Bearer b5d7fc6338d1681bab8e6d4637a181a58253504b0ba490190de5566149341ca0";
		//spec.headers("Authorization", Token);
		
	//	spec.headers(Token, Token, null)
	
		spec.headers("Authorization", Token).config(RestAssured.config().logConfig(LogConfig.logConfig().blacklistHeader("Authorization")))
		.config(RestAssured.config().logConfig(LogConfig.logConfig().blacklistHeader("Content-Type","Authorization","Accept")))
		.contentType(ContentType.JSON).body(payload.toJSONString()).log().all();
	ResponseOptions response=	spec.post();
	
	Assert.assertEquals(response.statusCode(),201);
	System.out.println("StatusLIne ====" + response.statusLine() );
	System.out.println("============================================");
	System.out.println("Body" + response.getBody().asPrettyString());
	
	
		
		       
		
		
		
		
	}  

}
