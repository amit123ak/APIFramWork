package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlacePojo;
import pojo.location;
import io.cucumber.java.en.Then;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;


import io.cucumber.java.en.And;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	@Given("Add place payload")
	public void add_place_payload() {
		System.out.println("All is well");
		AddPlacePojo ap=new AddPlacePojo();
		ap.setAccuracy(50);
		ap.setAddress("29, side layout, cohen 09");
		ap.setLanguage("French-IN");
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		ap.setName("Frontline house");
		location l=new location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		ap.setLocation(l);
		List<String> arr=new ArrayList<>();
		arr.add("shoe park");
		arr.add("shop");
		ap.setTypes(arr);
		
		/*
	 RequestSpecification request=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			 .addParam("key", "qaclick123")
		.setContentType(ContentType.JSON).build();
	//addParam("key", "qaclick123")
	
		
	
	ResponseSpecification  response=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

	  
		
		// TODO Auto-generated method stub
		//RestAssured.baseURI="https://rahulshettyacademy.com";
	RequestSpecification res=	given().spec(request)
		.body(ap);
		Response resp=res.when().post("/maps/api/place/add/json")
		.then().spec(response)
		.extract().response();

String responseString=resp.asString();
	
	System.out.println(responseString);
	
	*/
		
String res=		given().log().all().baseUri("https://rahulshettyacademy.com")
		.queryParam("key", "qaclick123").contentType(ContentType.JSON)
		.body(ap).when().post("/maps/api/place/add/json").then().extract().response().asString();
             	    
	 System.out.println(res);
	 
	}

	@When("user call {string} with post https request")
	public void user_call_with_post_https_request(String string) {
	  
	}

	@Then("The api call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	    
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String string, String string2) {
	    
	    
	}

	@Then("{string} in resonse body is {string}")
	public void in_resonse_body_is(String string, String string2) {
	    
	   
	}


}
