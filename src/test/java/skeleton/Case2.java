package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import skeleton.PageObject;

public class Case2 {
	WebDriver driver;
	
	@Given("user opens the login page in newtours application")
	public void user_opens_the_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.findElement(By.linkText("SignIn")).click(); 
	}

	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pass) {
		// driver.findElement(By.name("userName")).sendKeys(uname);
		//  driver.findElement(By.name("password")).sendKeys(pass);
		PageFactory.initElements(driver,PageObject.class);
		PageObject.un.sendKeys(uname);
		PageObject.pass.sendKeys(pass);
	}

	@When("Click Submit button")
	public void click_Submit_button() {

		 // WebElement login=driver.findElement(By.name("Login"));
		 // login.click();
		PageFactory.initElements(driver,PageObject.class);
		PageObject.login.click();
	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("login result is verified");
		String s;
		s=driver.getTitle();
		Assert.assertEquals("Home",s );
		driver.close();
	}


}
