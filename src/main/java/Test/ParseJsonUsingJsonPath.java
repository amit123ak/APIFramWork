package Test;

import com.jayway.jsonpath.JsonPath;

public class ParseJsonUsingJsonPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String response="{\"companyName\":\"MSE\",\"companyHOCity\":\"Benagluru\",\"companyCEO\":\"Amod\",\"supportedSalaryBanks\":[\"HDFC\",\"ICICI\",\"AXIS\"],\"pincodesOfCityOffice\":[560037,360034,456343],\"employee\":[{\"firstName\":\"Amod\",\"lastName\":\"Mahajan\",\"gender\":\"Male\",\"age\":28,\"salary\":10000.56,\"married\":false},{\"firstName\":\"Animesh\",\"lastName\":\"Prashant\",\"gender\":\"Male\",\"age\":30,\"salary\":20000.56,\"married\":false},{\"firstName\":\"Kitty\",\"lastName\":\"Gupta\",\"gender\":\"Female\",\"age\":26,\"salary\":30000.56,\"married\":false}],\"contractors\":[{\"firstName\":\"Seema\",\"lastName\":\"Singh\",\"contractFrom\":\"Jan-2019\",\"contractTo\":\"JAN-2025\"},{\"firstName\":\"Hari\",\"lastName\":\"Prasad\",\"contractFrom\":\"Jan-2017\",\"contractTo\":\"JAN-2030\"}],\"companyPFDeails\":{\"pfName\":\"XYZ\",\"pfCity\":\"Benagluru\",\"pfYear\":2012,\"noOfEmployees\":10}}";
		
	// Goal is Print Compony Name Componey City Or Compony	
	Object comNam=	JsonPath.read(response,"$.companyName");
		
	System.out.println(comNam);
	
	// 
	JsonPath.read(response, "$.companyCEO");
	
	
	for(int i=0;i<3;i++)
	{
		
		System.out.println( JsonPath.read(response, "$.pincodesOfCityOffice["+i+"]" ));
	}
	
		
		

	}

}
