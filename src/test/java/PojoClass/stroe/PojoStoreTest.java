package PojoClass.stroe;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoStoreTest {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ConstPojo consPojo=new ConstPojo();
		
		Book b1=new Book();
		
		
	
		b1.setCategory("reference");
		b1.setAuthor("Nigel Rees");
		b1.setTitle("syaing of the Century");
		b1.setPrice(8.95);
		

		Book b2=new Book();
		
		
	
		b2.setCategory("E reference");
		b2.setAuthor("Aigel Rees");
		b2.setTitle("Eyaing of the Century");
		b2.setPrice(9.95);
		
		
		Book b3=new Book();
		
		
		
		b3.setCategory("G reference");
		b3.setAuthor("Jigel Rees");
		b3.setTitle("Kyaing of the Century");
		b3.setPrice(10.95);
		
		 List<Book>booklist=new ArrayList<>();
		 booklist.add(b1);
		 booklist.add(b2);
		 booklist.add(b3);
		
		 Store st=new Store();
		 st.setBook(booklist);
		 
		 Bicycle Bi=new Bicycle();
		 Bi.setColor("Pink");
		 Bi.setPrice(10.23);
		 st.setBicycle(Bi);
		 ConstPojo conP=new ConstPojo();
		 conP.setStore(st);
		 
		 ObjectMapper objectmapper=new ObjectMapper();
		String payload= objectmapper.writerWithDefaultPrettyPrinter().writeValueAsString(conP);
		
		System.out.println(payload);
		 
		 
		
	}

}
