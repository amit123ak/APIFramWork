package PojoClass.stroe.pojo.AnotherWay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoTest {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
	
		Store  stR=new Store();
		/*category": "reference",
	      "author": "Nigel Rees",
	      "title": "Sayings of the Century",
	      "price": 8.95*/

	List<LinkedHashMap<String, Object>> book1=new ArrayList<LinkedHashMap<String,Object>>();
	
	LinkedHashMap<String, Object> book2=new LinkedHashMap<String, Object>();
	book2.put("category", "referenc");
	book2.put("author", "Nigel");
	book2.put("title", "Saying");
	book2.put("price", 8.5);
	
	LinkedHashMap<String, Object> book3=new LinkedHashMap<String, Object>();
	book3.put("category", "T referenc");
	book3.put("author", "A Nigel");
	book3.put("title", " B Saying");
	book3.put("price", 100.37);
	
	LinkedHashMap<String, Object> book4=new LinkedHashMap<String, Object>();
	book4.put("category", " U referenc");
	book4.put("author", " H Nigel");
	book4.put("title",  " R Saying");
	book4.put("price", 11.5);
	book1.add(book2);
	book1.add(book3);
	book1.add(book3);
	
	
    stR.setBook(book1);
    
    LinkedHashMap<String,Object>bicyle=new LinkedHashMap<String,Object>();
    bicyle.put("color", "RED");
    bicyle.put("price", 9);
	
	stR.setBicycle(bicyle);
	
	
	
	ConstP CP =new ConstP();
	CP.setStore(stR);

	
	ObjectMapper objectmapper=new ObjectMapper();
	
String pay=	objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(CP);
	System.out.println(pay);

	
	
	
	
	
}
}