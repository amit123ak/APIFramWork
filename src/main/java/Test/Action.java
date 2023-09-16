package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  
		  option.addArguments("--remote-allow-origins=*");
		  WebDriver driver =new ChromeDriver(option);
		 
		  //driver.get("https://www.makemytrip.com/flights");
		  driver.manage().window().maximize();
		  driver.get("https://www.browserstack.com/");
		  Actions ac=new Actions(driver);
		  Thread.sleep(3000);
		  WebElement ele=driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		  ac.doubleClick(ele).build().perform();
	}

}
