package Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  //option.addArguments(--remote-);
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver =new ChromeDriver(option);
		 
		  driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("newWindowBtn")).click();
		  
		  String fwin=driver.getWindowHandle();
		  System.out.println(fwin);
		  Set<String>handles=driver.getWindowHandles();
		  
		  for(String handle:handles)
		  {
			  
			  System.out.println(handle);
			  if(!fwin.equals(handle))
			  {
				  driver.switchTo().window(handle);
				  driver.findElement(By.id("firstName")).sendKeys("amit kumar");
			  }
		  }
		  
		  
		  

	}

}
