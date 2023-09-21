package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEcom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver =new ChromeDriver(option);
		 
		  //driver.get("https://www.makemytrip.com/flights");
		  driver.manage().window().maximize();
		  driver.get("https://admin-demo.nopcommerce.com/");
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]")).click();
		  
		  driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")).click();
		  
		  driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		  
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  
	js.executeScript("window.scrollBy(0,250)");
		  
	// js.executeAsyncScript("window.scrollBy(0, 250)");
		  //JavascriptExecutor js = (JavascriptExecutor) driver;
		//   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   
		 //  driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		   
         
	
		   
driver.findElement(By.cssSelector(".k-input.k-readonly")).click();	  

driver.findElement(By.xpath("//li[contains(text(),'Your store name')]")).click();


WebElement drop=driver.findElement(By.id("VendorId"));

Select sc =new Select(drop);

List<WebElement>options=sc.getOptions();

for(WebElement option1:options)
{
      	if(option1.getText().equalsIgnoreCase("Vendor 2"))
      	{
      		option1.click();
      	}
}
	
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
	  

	}

}
