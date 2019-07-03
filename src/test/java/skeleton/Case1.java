package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class Case1 {
	WebDriver driver;
	@Given("user opens signup page in TestMe App")
	public void user_opens_signup_page_in_TestMe_App() {
		System.out.println("Open application");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shwetha.samraj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}
	@When("user enters un as {string}")
	public void user_enters_un_as(String uname) {
		
		 driver.findElement(By.name("userName")).sendKeys(uname);
	}


	@When("user enters fn as {string}")
	public void user_enters_fn_as(String fname) {
		
		 driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@When("user enters ln as {string}")
	public void user_enters_ln_as(String ln) {
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@When("user enters psd as {string}")
	public void user_enters_psd_as(String pwd) {
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("user enters cnfrmpass as {string}")
	public void user_enters_cnfrmpass_as(String cpass) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}

	@When("user enters gender")
	public void user_enters_gender() {
		driver.findElement(By.name("gender")).click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enters mob as {string}")
	public void user_enters_mob_as(String mob) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mob);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String add) {
		driver.findElement(By.name("address")).sendKeys(add);
	}

	@When("user enters sec_ques as {string}")
	public void user_enters_sec_ques_as(String sec_q) {

	}

	@When("user enters sec_ans as {string}")
	public void user_enters_sec_ans_as(String sec_a) throws InterruptedException {
		driver.findElement(By.name("answer")).sendKeys(sec_a);
		Thread.sleep(2000);
	}

	@When("click signup button")
	public void click_signup_button() {
		driver.findElement(By.name("Submit")).click();
		}

	@Then("verify signup success message")
	public void verify_signup_success_message() throws InterruptedException {
		
		System.out.println("Success msg");
		Thread.sleep(5000);
		//WebElement s=driver.findElement(By.xpath("//*[@id='errormsg']"));
		
		String s;
		s=driver.getTitle();
		Assert.assertEquals("Login",s);
		
	}
	@Then("close application")
	public void close_application() {
		driver.close();
	}


}
