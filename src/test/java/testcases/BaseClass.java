package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.close();
	}

}
