package PojoClass.stroe.pojo.AnotherWay;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestConvertedJsonToclasssObject {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
		
		String payload=" { \"store\": {\r\n"
				+ "   \"book\": [\r\n"
				+ "    { \"category\": \"reference\",\r\n"
				+ "      \"author\": \"Nigel Rees\",\r\n"
				+ "      \"title\": \"Sayings of the Century\",\r\n"
				+ "      \"price\": 8.95\r\n"
				+ "    },\r\n"
				+ "    { \"category\": \"fiction\",\r\n"
				+ "      \"author\": \"Evelyn Waugh\",\r\n"
				+ "      \"title\": \"Sword of Honour\",\r\n"
				+ "      \"price\": 12.99\r\n"
				+ "    },\r\n"
				+ "    { \"category\": \"fiction\",\r\n"
				+ "      \"author\": \"Herman Melville\",\r\n"
				+ "      \"title\": \"Moby Dick\",\r\n"
				+ "      \"isbn\": \"0-553-21311-3\",\r\n"
				+ "      \"price\": 8.99\r\n"
				+ "    },\r\n"
				+ "    { \"category\": \"fiction\",\r\n"
				+ "      \"author\": \"J. R. R. Tolkien\",\r\n"
				+ "      \"title\": \"The Lord of the Rings\",\r\n"
				+ "      \"isbn\": \"0-395-19395-8\",\r\n"
				+ "      \"price\": 22.99\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "    \"bicycle\": {\r\n"
				+ "      \"color\": \"red\",\r\n"
				+ "      \"price\": 19.95\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ " }\r\n"
				+ " ";
		
		ObjectMapper objectmapper=new ObjectMapper();
	ConstP cp=	objectmapper.readValue(payload, ConstP.class);
	System.out.println("============================================================================");
		
		System.out.println(cp.getStore().getBook().get(0).get("category"));
		System.out.println(cp.getStore().getBook().get(0).get("author"));
		System.out.println(cp.getStore().getBook().get(0).get("title"));
		System.out.println(cp.getStore().getBook().get(0).get("price"));
		
		System.out.println("============================================================================");
		System.out.println(cp.getStore().getBook().get(1).get("category"));
		System.out.println(cp.getStore().getBook().get(1).get("author"));
		System.out.println(cp.getStore().getBook().get(1).get("title"));
		System.out.println(cp.getStore().getBook().get(1).get("price"));
		

		System.out.println("============================================================================");
		System.out.println(cp.getStore().getBook().get(2).get("category"));
		System.out.println(cp.getStore().getBook().get(2).get("author"));
		System.out.println(cp.getStore().getBook().get(2).get("title"));
		System.out.println(cp.getStore().getBook().get(2).get("price"));
		

		System.out.println("============================================================================");
		System.out.println(cp.getStore().getBook().get(3).get("category"));
		System.out.println(cp.getStore().getBook().get(3).get("author"));
		System.out.println(cp.getStore().getBook().get(3).get("title"));
		System.out.println(cp.getStore().getBook().get(3).get("price"));
		
		System.out.println("============================================================================");
		System.out.println(cp.getStore().getBicycle().get("color"));
		System.out.println(cp.getStore().getBicycle().get("price"));
		
		
		
		
		
		
		
		

	}

}
