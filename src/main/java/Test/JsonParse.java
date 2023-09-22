package Test;

import com.jayway.jsonpath.JsonPath;

public class JsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String res="{\"firstName\":\"John\",\"lastName\":\"doe\",\"age\":26,\"address\":{\"streetAddress\":\"naiststreet\",\"city\":\"Nara\",\"postalCode\":\"630-0192\"},\"phoneNumbers\":[{\"type\":\"iPhone\",\"number\":\"0123-4567-8888\"},{\"type\":\"home\",\"number\":\"0123-4567-8910\"}]}";
		
     
    Object fname=  JsonPath.read(res, "$.firstName");
     //JsonPath.read(res,  "$.firstName", null)
    Object typeP= JsonPath.read(res, "$.phoneNumbers[0].type");
    
    System.out.println(fname);
    
    System.out.println(typeP);
    
    
    Object city= JsonPath.read(res, "$.['address'].city");
    
     System.out.println(city);

     

     Object nu[]= JsonPath.read(res, "$.phoneNumbers[0:2].number");
     
      System.out.println(nu[0]);
    
     
	}

}
