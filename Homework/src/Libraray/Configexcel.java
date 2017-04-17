package Libraray;
import Libraray.Excel;

public class Configexcel {

	
	
	public static void main(String[] args)
	
	{
		Excel ex= new Excel("C:/Users/qayyum/Desktop/read.xls");
		
		//String data5 =ex.getdata(0, 0, 0);
		
		
		System.out.println(ex.getdata(0, 0, 0));
		
		
		
		
		
		
	}
	
	
	
	
}
