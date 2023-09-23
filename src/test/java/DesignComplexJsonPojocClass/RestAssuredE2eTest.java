package DesignComplexJsonPojocClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssuredE2eTest {
  @Test
  public void E2EAPITest() {
	  
	  RequestSpecification spec =RestAssured.given();
	  
	  spec.baseUri("https://run.mocky.io");
	  spec.basePath("/v3/032b32e8-8256-406c-b08c-5eda5cfd0bdd");
	  EmployeeInformation emp=  spec.get().as(EmployeeInformation.class);
	  
	  System.out.println("fname"+ emp.getFirstname());
	  System.out.println("fname"+ emp.getGender());
	  System.out.println("fname"+ emp.getLastname());
	  System.out.println("fname"+ emp.getSalary());
	List<String> list= emp.getHobbies();
	
	 for(int i=0;i<list.size();i++)
	 {
		 System.out.println(list.get(i));
	 }
HashMap<String,String>map=(HashMap<String, String>) emp.getFamilyMembers();	 
           for( Entry<String,String>entry:map.entrySet())
           {
        	   System.out.println( entry.getKey()+"  =  " + entry.getValue());
           }
	  
	  
	  
	   
  }
}
