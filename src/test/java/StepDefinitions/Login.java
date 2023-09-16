package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {
	 WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions option=new ChromeOptions();
		  
		  
		  option.addArguments("--remote-allow-origins=*");
		  driver =new ChromeDriver(option);
		 
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		  driver.manage().window().maximize();
	  
	}

	@When("User is enter {string} and {string}")
	public void user_is_enter_and(String username, String password) {
	  driver.findElement(By.id("username")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   
	}
	@When("User is enter credential using DataTable")
	public void user_is_enter_credential_using_data_table(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data=dataTable.cells();
		  driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		   driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		
		
	   
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.id("submit")).click();
	   
	}

	
	@Then("User is Navigated to the home Page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	String str=	driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]")).getText();
	
	   System.out.println(str);
	   Assert.assertEquals(str, "Congratulations student. You successfully logged in!", "Login Failed due to worng user name password");
	   
	}


}
