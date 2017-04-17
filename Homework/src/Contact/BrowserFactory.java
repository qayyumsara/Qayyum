package Contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 

{

static WebDriver driver;

public static WebDriver StartBrowser(String browser, String url)
{
	
	if(browser.equals("Firefox"))
	{
		
		driver= new FirefoxDriver();
	}
	
	else if (browser.equals("Ch"))
	{
		
		driver =new ChromeDriver();
		

	}
	
	else if (browser.equalsIgnoreCase("IE"))
	{
		
		
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	
	driver.get(url);
	
	return driver;
	
}


	
}
