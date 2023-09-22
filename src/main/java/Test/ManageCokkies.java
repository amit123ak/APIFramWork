package Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageCokkies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver =new ChromeDriver(option);
		 
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		
		Set<Cookie> cookies= driver.manage().getCookies();
		
		
           System.out.println("Before size="+cookies.size());
           
           for(Cookie ck:cookies)
           {
        	   System.out.println(ck.getName() + " "+ ck.getValue());
           }
	   
	    
	    System.out.println( driver.manage().getCookieNamed("INR"));
	    
	    
	    
	    Cookie cookie=new Cookie("abc","Amezon.in");
	    driver.manage().addCookie(cookie);
	    
		Set<Cookie> cook= driver.manage().getCookies();

        System.out.println("After size="+cook.size());
        
        for(Cookie ck:cook)
        {
     	   System.out.println(ck.getName() + " "+ ck.getValue());
        }
	   
	    
	    driver.manage().deleteCookie(cookie);
	    
	    driver.manage().deleteAllCookies();
	    
	
	   
	    
		Set<Cookie> cooks= driver.manage().getCookies();

        System.out.println("After Delete size="+cook.size());
        
        for(Cookie ck:cooks)
        {
     	   System.out.println(ck.getName() + " "+ ck.getValue());
        }
	   
	    

	}
	


}
