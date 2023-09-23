package DesignComplexJsonPojocClass;

import java.util.List;
import java.util.Map;

public class EmployeeInformation {
	
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	private int salary;
	private List<String> hobbies;
	private  Map<String,String> familyMembers;
	private boolean married;

	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Map<String, String> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(Map<String, String> familyMembers) {
		this.familyMembers = familyMembers;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}

}
