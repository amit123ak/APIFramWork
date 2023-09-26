package PojoClass.stroe;

import java.util.List;

public class Store {
	
	
	private List<Book>book;
	
	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public Bicycle getBicycle() {
		return bicycle;
	}

	public void setBicycle(Bicycle bicycle) {
		this.bicycle = bicycle;
	}

	private Bicycle bicycle;

}
