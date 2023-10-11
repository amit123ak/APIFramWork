package JSonParserPakage;

import io.restassured.path.json.JsonPath;

public class ParsedUsingJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String payload="{\r\n"
				+ "  \"store\": {\r\n"
				+ "    \"book\": [\r\n"
				+ "      {\r\n"
				+ "        \"category\": \"fiction\",\r\n"
				+ "        \"title\": \"The Catcher in the Rye\",\r\n"
				+ "        \"author\": \"J.D. Salinger\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"category\": \"fiction\",\r\n"
				+ "        \"title\": \"To Kill a Mockingbird\",\r\n"
				+ "        \"author\": \"Harper Lee\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"category\": \"non-fiction\",\r\n"
				+ "        \"title\": \"Sapiens: A Brief History of Humankind\",\r\n"
				+ "        \"author\": \"Yuval Noah Harari\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"bicycle\": {\r\n"
				+ "      \"color\": \"red\",\r\n"
				+ "      \"price\": 19.95\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		
		
		JsonPath jsonpath=new JsonPath(payload);
		
		jsonpath.getString("store.bicycle.price");
		
		System.out.println(jsonpath.getString("store.bicycle.price"));
		System.out.println(jsonpath.getDouble("store.bicycle.price"));
		
		System.out.println(jsonpath.getString("$.store.book[0].title"));

	}

}
