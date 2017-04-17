package Technical_asses;

import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;
//import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import com.google.gson.JsonNull;

public class Coordinate_lat

{

	WebDriver driver;
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
     String Address = "RobertsFarm|Smarden+road|Smarden|Ashford|Kent|TN278QJ"; //storing address

     //calling the Google api / Geocode with Address and API key

     driver.get("https://maps.googleapis.com/maps/api/geocode/json?address=" + Address + "&key=" + Apikey);

     // Maximize the window 
   //  var obj= JsonNull.parse(location);
   
     JSONParser parser = new JSONParser();
     try {
          
         Object obj = parser.parse(new FileReader("C:\\Users\\qayyum\\Desktop\\New\\lifeinuk\\location.json"));
  
         JSONObject jsonObject = (JSONObject) obj;
  
        // String name = (String) jsonObject.get("location");
         //System.out.println(name);
         
         double La1 = (double) jsonObject.get("lat");
         System.out.println("Latitude = " + La1);
         
         double Lo1 = (double) jsonObject.get("lng");
         System.out.println("Longitude = " + Lo1);
         
         double latitude= 51.1376409 ; 
         double longitude =0.6657689;
         
         
         if(La1== latitude && Lo1==longitude )
        	 
         {
        	 System.out.println("Test case passed");
        	 
         }
         else
         {
        	 
        	 System.out.println("Test case Failed");
        	 
                
         }
       /*  JSONArray msg = (JSONArray) jsonObject.get("location");
         @SuppressWarnings("unchecked")
		Iterator<String> iterator = msg.iterator(); 
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
  */
       //  long age = (Long) jsonObject.get("age");
         //System.out.println(age);
  
         // loop array
      /*   JSONArray msg = (JSONArray) jsonObject.get("messages");
         Iterator<String> iterator = msg.iterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next()); */
         
  
     }
         catch (FileSystemNotFoundException e) {
         e.printStackTrace(); }
    
     driver.manage().window().maximize();


     Thread.sleep(5000);
	
}


     @After

public void exit()

{
	
	
	driver.quit();
}

	
	
	
}
