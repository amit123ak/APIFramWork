package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	  WebDriverManager.chromedriver().setup();
	  
	  ChromeOptions option=new ChromeOptions();
	  
	  
	  option.addArguments("--remote-allow-origins=*");
	  WebDriver driver =new ChromeDriver(option);
	 
	  driver.get("https://www.makemytrip.com/flights");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	
      driver.navigate().refresh();
	  driver.navigate().forward();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  
	
 driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column active']")).click();

	  Thread.sleep(5000);
 
	    List<String>list1=new ArrayList<>();
			  list1.add("Mumbai, India");
			  list1.add("Bangkok, Thailand");
			  list1.add("New Delhi, India");
			  list1.add("Bengaluru, India");
			  list1.add("Pune, India");
			  List<String>list2=new ArrayList<>();
			  list2.add("Pune, India");
			  list2.add("Bengaluru, India");
			  list2.add("Bengaluru, India");
			  list2.add("Pune, India");
			  list2.add("New Delhi, India");
			  
     for(int i=0;i<list1.size() || i<list2.size();i++)
     {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'From')]"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),"+"'"+list1.get(i)+"'"+")]"))).click();
	
     
     
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'To')]"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),"+"'"+list2.get(i)+"'"+")]"))).click();
	driver.findElement(By.xpath("//div[@aria-label='Thu Sep 14 2023']//p[contains(text(),'14')]")).click();
	  
	
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Search']"))).click();

   // Thread.sleep);
    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".chNavIcon.appendBottom2.chSprite.chFlights.active"))).click();
    
    
     }
	  

	}

}
