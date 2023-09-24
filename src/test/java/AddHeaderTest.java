import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;


public class AddHeaderTest {
  @Test
  public void AddHeaders() {
	  
	  
	  
	  Header header1=new Header("Header1","Value1");
	  Header header2=new Header("Header2","Value2");
	  Header header3=new Header("Header3","Value3");
	  Header header4=new Header("Header4","Value4");
	  List<Header>headerlist=new ArrayList<>();
	  headerlist.add(header1);
	  headerlist.add(header2);
	  headerlist.add(header3);
	  headerlist.add(header4);
	  
	  Headers headerobj=new Headers(headerlist);
	  
	  RequestSpecification spec=RestAssured.given();
	  spec.baseUri("https://reqres.in");
	  spec.basePath("/api/users");
	  spec.queryParam("page", 1);
	  spec.headers(headerobj).log().all();
	 Response response= spec.get();
	 
	 System.out.println(response.body().asPrettyString());
	  
	  
	  
	  
	  
	 
	 
	  
  }
}
