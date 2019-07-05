package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Class3 {
	WebDriver driver;
	@Given("user opens the login page in TestMe App")
	public void user_opens_the_login_page_in_TestMe_App() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.findElement(By.linkText("SignIn")).click();
		  
	    
	}

	@When("User enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String un, String pass) {
		driver.findElement(By.name("userName")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(pass);
		 
	}

	@When("click Submit button")
	public void click_Submit_button() {
		 WebElement login=driver.findElement(By.name("Login"));
		  login.click();
	}

	@When("search for product")
	public void search_for_product() {
		
		WebElement search=driver.findElement(By.name("products"));
		
		Actions actions=new Actions(driver);

		actions.sendKeys(search,"head").sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ENTER).build().perform();
		//WebElement value=driver.findElement(By.name("products"));
		//  value.sendKeys("head");
		//  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("verify Search")
	public void verify_Search() {
	//String s;
	//s=driver.getTitle();
	WebElement s=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4"));
	String str=s.getText();
	Assert.assertEquals("Headphone",str);
	driver.close();
	}
}
