package PojoClass.stroe.pojo.AnotherWay;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Store {
	
	


	public List<LinkedHashMap<String, Object>> getBook() {
		return book;
	}
	public void setBook(List<LinkedHashMap<String, Object>> book) {
		this.book = book;
	}
	public LinkedHashMap<String, Object> getBicycle() {
		return bicycle;
	}
	public void setBicycle(LinkedHashMap<String, Object> bicycle) {
		this.bicycle = bicycle;
	}
	private List<LinkedHashMap<String, Object>> book;
	private LinkedHashMap<String,Object>bicycle;

}
