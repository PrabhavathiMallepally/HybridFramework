package testcases;

import org.testng.annotations.Test;

import pageobjectmodel.LoginPage;

public class TestCase extends BaseClass {
	@Test
	public void LoginTest() throws InterruptedException
	{
		LoginPage L=new LoginPage(driver);
		Thread.sleep(2000);
		L.Username();
		System.out.println("Username entered successfully");
		Thread.sleep(2000);
		L.Password();
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		L.Login();
		System.out.println("Login is successfull");
	}


}
