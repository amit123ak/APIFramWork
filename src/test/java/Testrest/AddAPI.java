package Testrest;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.http.ContentType;
import pojo.AddPlacePojo;
import pojo.location;

public class AddAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		String res=		given().log().all().baseUri("https://rahulshettyacademy.com")
				.queryParam("key", "qaclick123").contentType(ContentType.JSON)
				.body(ap).when().post("/maps/api/place/add/json").then().extract().response().asString();
		             	    
			 System.out.println(res);

	}

}
