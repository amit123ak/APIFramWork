package IgnoreFieldvaluePojo;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonInclude(Include.NON_NULL)
//@JsonInclude(Include.NON_DEFAULT)
//@JsonIgnoreProperties(ignoreUnknown = true)



//allowSetter is used at the time Serialization Process

//@JsonIgnoreProperties(ignoreUnknown = true)

@JsonIgnoreProperties(value={"gender","age"},allowSetters=true)
public class EmployeeInfo {
	
	/*
	 
{
 "firstName": "Suresh",
 "lastName": "Mehra", "gender": "Male",
 "age":35,
 "Salary":10000,
 "IsMarried": true,
 "fullName":"Suresh Mehra Kush"
}
	 */
	//JsonProperty(access=JsonProperty.READ_ONLY used for  de Searilazaton  processs to ignore the particular filed 
	//JsonProperty(access=JsonProperty.Access.WRITE_ONLY ) Is Used for AT TIME OF SERIALAZATION PROCESS
	
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private String lastName;
	private String gender;
	private String age;
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private  int salary;
	private boolean IsMarried ;
	
	//@JsonIgnore
	//@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private String  fullName;
	
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
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
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public boolean isIsMarried() {
		return IsMarried;
	}
	public void setIsMarried(boolean isMarried) {
		IsMarried = isMarried;
	}

	

}



