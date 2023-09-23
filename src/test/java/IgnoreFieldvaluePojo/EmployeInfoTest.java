package IgnoreFieldvaluePojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import PojoClass.EmployeeDetails;

public class EmployeInfoTest {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		
		/*
		{
			 "firstName": "Suresh",
			 "lastName": "Mehra",
			 "gender": "Male",
			 "age":35,
			 "Salary":10000,
			 "IsMarried": true
			}
		*/
		EmployeeInfo emp=new EmployeeInfo();
		emp.setFirstName("Suresh");
		emp.setLastName("Mehara");
		emp.setgender("Male");
	
		emp.setAge("30");
		emp.setIsMarried(true);
		
		emp.setsalary(30000);
		emp.setFullName("Suresh Mehra Kush");
		
		ObjectMapper objectmapper =new ObjectMapper();
		
		
		String payload =objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		
		System.out.println(payload);
		System.out.println("======================================================================");
		
		 String ResPayload="{\r\n"
		 		+ " \"firstName\": \"Suresh\",\r\n"
		 		+ " \"lastName\": \"Mehra\",\r\n"
		 		+ " \"gender\": \"Male\",\r\n"
		 		+ " \"age\":35,\r\n"
		 		+ " \"salary\":10000,\r\n"
		 		+ " \"isMarried\": true,\r\n"
		 		+ " \"fullName\":\"Suresh Mehra Kush\"\r\n"
	
		 		+ "}";
		 
		 
		 
		 objectmapper.readValue(ResPayload, EmployeeInfo.class);
		 
		 System.out.println("firstName "+ emp.getFirstName());
		 System.out.println("lastName "+ emp.getLastName());
		 System.out.println("gender "+ emp.getgender());
		 System.out.println("age "+ emp.getAge());
		 System.out.println("salary "+ emp.getsalary());
		 System.out.println("IsMarried "+ emp.isIsMarried());
		 System.out.println("fullName "+ emp.getFullName());
		 
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
