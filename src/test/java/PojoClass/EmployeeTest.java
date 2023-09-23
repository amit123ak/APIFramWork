package PojoClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeTest {

	public static void main(String[] args) throws JsonProcessingException {
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
		EmployeeDetails emp=new EmployeeDetails();
		emp.setFirstName("Suresh");
		//emp.setLastName("Mehara");
		emp.setgender("Male");
	
		//emp.setAge("30");
		//emp.setIsMarried(true);
		
		emp.setSalary(30000);
		
		ObjectMapper objectmapper =new ObjectMapper();
		
		String payload =objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		
		System.out.println(payload);
		
		

	}

}
