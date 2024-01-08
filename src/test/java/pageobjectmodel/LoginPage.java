package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement login;
	public void Username()
	{
		username.sendKeys("Prabhavathi123");
	}
	public void Password()
	{
		password.sendKeys("Prabhavathi@123");
	}
	public void Login()
	{
		login.click();
	}

}
