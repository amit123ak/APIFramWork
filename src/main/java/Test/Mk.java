package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  //option.addArguments(--remote-);
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver =new ChromeDriver(option);
		 
		  driver.get("https://www.makemytrip.com/flights");
		  driver.manage().window().maximize();
		//  driver.findElement(By.xpath("//INPUT[@id='hp-widget__sfrom']")).click();
	      driver.navigate().refresh();
		  driver.navigate().forward();
		  Thread.sleep(2000);
		  List<String>list1=new ArrayList<>();
		  list1.add("Mumbai, India");
		  list1.add("Pune");
		  list1.add("Ahmedabad");
		  list1.add("Mumbai");
		  List<String>list2=new ArrayList<>();
		  list2.add("Gorakhpur");
		  list2.add("Lucknow");
		  list2.add("Ahmedabad");
		  list2.add("Pragraj");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'From')]"))).click();
	WebElement from=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
	
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'To')]"))).click();
WebElement To=wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));
WebElement Search=driver.findElement(By.xpath("//a[text()='Search']"));
    for(int i=0;i<list1.size();i++)
    {
   	  from.sendKeys(list1.get(i));
   	  
   	  for(int j=0;j<=i;i++)
   	  {
   		  To.sendKeys(list2.get(j));
   	  }
   	  Search.click();
   	  Thread.sleep(5000);
    driver.findElement(By.cssSelector(".chNavIcon.appendBottom2.chSprite.chFlights.active")).click();
   	  
   	  
    }
		
		  

	}

}
