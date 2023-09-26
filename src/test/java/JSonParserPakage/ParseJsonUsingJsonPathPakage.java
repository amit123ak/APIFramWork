package JSonParserPakage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ParseJsonUsingJsonPathPakage {
	
	
	
	@Test
	public void jsonPathPakage() throws JsonProcessingException
	{
		String pa="{\r\n"
				+ "\"page\": 2,\r\n"
				+ "\"per_page\": 6,\r\n"
				+ "\"total\": 12,\r\n"
				+ "\"total_pages\": 2,\r\n"
				+ "\"data\": [\r\n"
				+ "{\r\n"
				+ "\"id\": 7,\r\n"
				+ "\"email\": \"michael.lawson@reqres.in\",\r\n"
				+ "\"first_name\": \"Michael\",\r\n"
				+ "\"last_name\": \"Lawson\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 8,\r\n"
				+ "\"email\": \"lindsay.ferguson@reqres.in\",\r\n"
				+ "\"first_name\": \"Lindsay\",\r\n"
				+ "\"last_name\": \"Ferguson\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/8-image.jpg\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 9,\r\n"
				+ "\"email\": \"tobias.funke@reqres.in\",\r\n"
				+ "\"first_name\": \"Tobias\",\r\n"
				+ "\"last_name\": \"Funke\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/9-image.jpg\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 10,\r\n"
				+ "\"email\": \"byron.fields@reqres.in\",\r\n"
				+ "\"first_name\": \"Byron\",\r\n"
				+ "\"last_name\": \"Fields\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/10-image.jpg\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 11,\r\n"
				+ "\"email\": \"george.edwards@reqres.in\",\r\n"
				+ "\"first_name\": \"George\",\r\n"
				+ "\"last_name\": \"Edwards\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/11-image.jpg\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": 12,\r\n"
				+ "\"email\": \"rachel.howell@reqres.in\",\r\n"
				+ "\"first_name\": \"Rachel\",\r\n"
				+ "\"last_name\": \"Howell\",\r\n"
				+ "\"avatar\": \"https://reqres.in/img/faces/12-image.jpg\"\r\n"
				+ "}\r\n"
				+ "],\r\n"
				+ "\"support\": {\r\n"
				+ "\"url\": \"https://reqres.in/#support-heading\",\r\n"
				+ "\"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "";
		
	RequestSpecification respec=	RestAssured.given();
	respec.baseUri("https://reqres.in/");
	
	respec.basePath("/api/users");
	
	respec.queryParam("page", 2);
  String payload=	respec.get().then().extract().asString();
     Object page=  JsonPath.read(payload, "$.page");
     
     System.out.println(page);
    
             
      
     System.out.println("PerPage"+ JsonPath.read(payload, "$.per_page"));

        System.out.println("total"+ JsonPath.read(payload, "$.total"));
        
        for(int i=0;i<6;i++)
        {
        	
            System.out.println("PerPage"+ JsonPath.read(payload, "$.data["+i+"].id"));
            System.out.println("PerPage"+ JsonPath.read(payload, "$.data["+i+"].email"));
            System.out.println("PerPage"+ JsonPath.read(payload, "$.data["+i+"].first_name"));
            System.out.println("PerPage"+ JsonPath.read(payload, "$.data["+i+"].last_name "));
            System.out.println("PerPage"+ JsonPath.read(payload, "$.data["+i+"].avatar"));
        	
        }
        
        
        
    System.out.println(JsonPath.read(payload, "$.data[?(@.first_name =='Michael')].first_name"));
    
	List<Map<String,Object>>list=JsonPath.parse(pa).read("$.data");
	
	System.out.println(list);
	System.out.println("=======================================================================");
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).get("id"));
		System.out.println(list.get(i).get("email"));
		System.out.println(list.get(i).get("first_name"));
		System.out.println(list.get(i).get("last_name"));
		System.out.println(list.get(i).get("avatar"));
		
		
	}
	
	System.out.println("========================================================================================================================");
	Map<String,Object>list1=JsonPath.parse(pa).read("$.support");
	
	
	for(Entry<String, Object> entry:list1.entrySet())
	{
		System.out.println(entry.getValue());
		
	}
	
	
	
	
	
	
	}

}
