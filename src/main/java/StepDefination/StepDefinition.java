package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ApplicationPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	public LoginPage login;
	@Given("User launch website daxko.com")
	public void user_launch_website_daxko_com() {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");					
		driver= new ChromeDriver();					
		driver.manage().window().maximize();	
		driver.get("https://glo.globallogic.com/apps/glo/login");
		throw new io.cucumber.java.PendingException();
	}

	@When("user entering Username rcruz")
	public void user_entering_Username_rcruz() {
		login.setUsername("priyanka.sengar");
		throw new io.cucumber.java.PendingException();
	}

	@When("password rcruz")
	public void password_rcruz() {
		login.setUsername("Global@123456");
		throw new io.cucumber.java.PendingException();
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		login.loginButton();
		throw new io.cucumber.java.PendingException();
	}


}
