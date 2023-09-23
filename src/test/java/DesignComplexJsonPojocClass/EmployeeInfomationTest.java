package DesignComplexJsonPojocClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeInfomationTest {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		EmployeeInformation e1=new EmployeeInformation();
          e1.setFirstname("Suresh");
          e1.setLastname("Mehra");
          e1.setGender("Male");
          e1.setAge(35);
         List<String>hobbies=new ArrayList<>();
         
          hobbies.add("Reading");
          hobbies.add("Music");
          e1.setHobbies(hobbies);  
          
          Map<String,String>familyC=new HashMap<>();
          familyC.put("1", "Mother");
          familyC.put("2", "Father");
          
          e1.setFamilyMembers(familyC);
          
          e1.setMarried(true);
          
          ObjectMapper objectmapper=new ObjectMapper();
       String payload=   objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(e1);
       
       System.out.println(payload);
          
          
          
          
	}

}
