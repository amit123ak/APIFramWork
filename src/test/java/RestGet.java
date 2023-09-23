
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
public class RestGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 given()
		.when()
		.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then()
		.log().all();
   
		 
	      RestAssured.baseURI="http://demo.guru99.com";
		 
		 given()
         .queryParam("CUSTOMER_ID", "68195")
         .queryParam("PASSWORD","1234!")
         .queryParam("Account_No","1")
         .when()
         .get("/V4/sinkministatement.php")
         .then().log()
         .body();
		 
		 System.out.println("=======================================================");
		 
		 
	int statuscode=	  given()
         .queryParam("CUSTOMER_ID", "68195")
         .queryParam("PASSWORD","1234!")
         .queryParam("Account_No","1")
         .when()
         .get("/V4/sinkministatement.php")
         .getStatusCode();
	
	
	System.out.println("status code "+ statuscode);
	
	
	
	
	
		 
         
	}

}
