package Contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Contact.Tests;

public class LoginPage {
	
	
	@Test
	public void logic() throws InterruptedException
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/signin");
		
		Tests login= new Tests(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLogin();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
