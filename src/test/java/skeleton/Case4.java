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

public class Case4 {
	WebDriver driver;
	int cart;
@Given("User open login page of Testme app")
public void user_open_login_page_of_Testme_app() {
	 System.out.println("user opened the application");
	  
	  	System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		WebElement signin= driver.findElement(By.linkText("SignIn"));
		signin.click();
}

@When("user enters username as {string} and password as {string}")
public void user_enters_username_as_and_password_as(String string, String string2) {
	WebElement uname= driver.findElement(By.name("userName"));
	uname.sendKeys(string);
	WebElement pwd= driver.findElement(By.name("password"));
	pwd.sendKeys(string2);
}

@When("user clicks submit button")
public void user_clicks_submit_button() {
	 System.out.println("clicked on submit button");
	 
	WebElement log= driver.findElement(By.name("Login"));
	log.click();
}

@When("user search a particular product like headphones")
public void user_search_a_particular_product_like_headphones() {
	WebElement search=driver.findElement(By.name("products"));
	
	Actions actions=new Actions(driver);

	actions.sendKeys(search,"headphone").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}

@When("user tries to access cart page")
public void user_tries_to_access_cart_page() {
	//cart=driver.findElement(By.partialLinkText("Cart")).getText();
	
	cart=driver.findElements(By.partialLinkText("Cart")).size();	//to check if the link exists
	
}

@Then("Testme app doesn't display the cart icon")
public void testme_app_doesn_t_display_the_cart_icon() {
  
	if(cart>0)
	{	
	Assert.assertTrue(false);}
	else
	{
	Assert.assertTrue(true);}
	
	driver.close();
}

}
