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

public class Ambiguous_Location {

	
	


	WebDriver driver;
	String name1;
	String name2;
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
	
	
	 String Apikey = "AIzaSyA2NOcfwQ4KlHsJZNJ4LOQ_-AimXNhlHj8"; // storing API key

     String Address = "Sea Front"; // to store location name sea front

     //calling the Google api / Geocode with Address and API key

     driver.get("https://maps.googleapis.com/maps/api/geocode/json?address=" + Address + "&key=" + Apikey);

     // Maximize the window 
     
     driver.manage().window().maximize();

// manually store the json format by copying in notepad and save it as Amb_loc.json in location 
     Thread.sleep(5000);

	//  here you reading the data from the file you saved 

     JSONParser parser = new JSONParser();
     try {
          
         // storing the file = Amb_loc into obj 
    	 
    	 Object obj = parser.parse(new FileReader("C:\\Users\\qayyum\\Desktop\\New\\lifeinuk\\Amb_loc.json"));
  
         //storing the obj into jsonobject as the file is in json format 
         JSONObject jb = (JSONObject) obj;
  
         // extrating the data from the file where long_name1 has data and storing in new string name1
         name1 = (String) jb.get("long_name1");
         
         // printing data stored in strin obj name 1
         System.out.println("Location 1=" +name1);
         
       
         name2 = (String) jb.get("long_name2");
         System.out.println("Location 2 = " + name2);
 
     } 
     
     catch (FileSystemNotFoundException e) 
     {
     e.printStackTrace(); 
     
     }
     
 
     if(name1.equals(name2))
     {
    	 
    	 
    	 System.out.println("ONLY ONE LOCATION FOUND");
    	 
     }
     
     else
    	 
     {
    	 
    	System.out.println("MORE THAN ONE LOCATION FOUND" + name1 + " & " + name2); 
    	 
     }
     
     
     
     
     }

    
     
     
     

@After

public void exit()

{
	
	
	driver.quit();
}

	
}
