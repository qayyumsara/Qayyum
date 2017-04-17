package Contact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Agents {

	WebDriver driver;
	
	@BeforeTest
	
	public void open()
	{
		

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
	}
	
	@Test 
	
	public void scripts() throws Throwable
	
	{  
		
		// OPEN UMOVE INDIA URL
		
		
		driver.get("http://www.umoveindia.com/__testserver2013/index.php");
	
		
		// CLICK ON AGNETS AND BUILDERS LINK
		
		driver.findElement(By.linkText("Agents / Builders")).click();
		
		// CHECK FOR ASSERT EQUALS FIND THE AGENT ON AGENTS BUILDER PAGE
		
		
		assertEquals("Find the Agent/Builder",driver.findElement(By.xpath("//*[@id='frmquicksearch']/span")).getText());
		
		// SEND CHENNAI IN THE AGENT NAME FIELD
		
		driver.findElement(By.id("agents_builders")).sendKeys("chennai");
		
		// SELECT FROM DROP DOWN LIST
		new Select(driver.findElement(By.xpath("//*[@id='state1']"))).selectByVisibleText("All");
		
		// CLICK ON SEARCH
		
		driver.findElement(By.xpath("//*[@id='frmquicksearch']/input[2]")).click();
		
		// CLICK ON HOME BUTTON 
		
		driver.findElement(By.xpath("//*[@id='mega-menu-2']/li[1]/a")).click();
		
		
		// CLICK ON AGENTS /BUILERS LINK
		
		
		driver.findElement(By.linkText("Agents / Builders")).click();
		
		
		// CLEAR THE ENTER AGENT FIELD 
		
		driver.findElement(By.xpath("//*[@id='agents_builders']")).clear();
		
		
		// ENTER NEW BUILDER NAME
		driver.findElement(By.id("agents_builders")).sendKeys("asian");
		
		
		// SELECT FROM DROP DOWN LIST
		new Select(driver.findElement(By.xpath("//*[@id='state1']"))).selectByVisibleText("All");
		
		
		Thread.sleep(2000);
		
		// CLICK ON SEARCH
		
		
		driver.findElement(By.xpath("//*[@id='frmquicksearch']/input[2]")).click();
		
		// PRINT PASS I AM NOT VERYING ANY ASSERT TEXT HERE 
		
		System.out.println("PASSED");
		
		
	}
	
	
	
	
	
	
	
	
	@AfterTest
	
	public void close()
	
	
	{ 
		
		driver.quit();	
		
	}
	
	
	
	
	
	
	
	
}
