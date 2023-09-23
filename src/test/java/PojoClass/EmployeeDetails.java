package PojoClass;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//@JsonInclude(Include.NON_NULL)
@JsonInclude(Include.NON_DEFAULT)
public class EmployeeDetails {
	
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
	private String lastName;
	private String gender;
	private String age;
	private  int Salary;
	private boolean IsMarried ;
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public boolean isIsMarried() {
		return IsMarried;
	}
	public void setIsMarried(boolean isMarried) {
		IsMarried = isMarried;
	}

	

}
