package ApplicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By username=By.xpath("//input[@id='login']");
	By password=By.xpath("//input[@id='password']");
	By loginButton=By.xpath("//input[@value='LOGIN']");
	public void setUsername(String Username)
	{
		driver.findElement(username).sendKeys(Username);
	}

	public void setPassword(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}

	public void loginButton()
	{
		driver.findElement(loginButton).click();
	}


}
