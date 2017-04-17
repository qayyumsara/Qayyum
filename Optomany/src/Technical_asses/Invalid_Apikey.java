package Technical_asses;

import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invalid_Apikey {

	WebDriver driver;
	String r;
	@Before 
	
public void first()
	
	{
		
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	
	

@Test

public void logic() throws Exception
{
	
	
     String Apikey = "11111a11111"; // storing wrong API key

     String Address = "TN278QJ"; // Storing right post code

     //calling the Google api / Geocode with Address and API key

     driver.get("https://maps.googleapis.com/maps/api/geocode/json?address=" + Address + "&key=" + Apikey);

     // Maximize the window 
     driver.manage().window().maximize();


     Thread.sleep(5000);
     

     JSONParser parser = new JSONParser();
     try {
          
         Object obj = parser.parse(new FileReader("C:\\Users\\qayyum\\Desktop\\New\\lifeinuk\\Invalid_key.json"));
  
         JSONObject jsonObject = (JSONObject) obj;
  
        // String name = (String) jsonObject.get("location");
         //System.out.println(name);
         
          r = (String) jsonObject.get("status");
         System.out.println("Status = " + r);
 
     }
     catch (FileSystemNotFoundException e) {
     e.printStackTrace(); }
 
     String error= "REQUEST_DENIED";
     
     if(r.equals(error))
    	 
     {
    	 System.out.println("TEST CASE PASSED");
    	 
     }

	
}

@After

public void exit()

{
	
	
	driver.quit();
}


}
