package fri;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class REad {

	public static void main(String[] args) throws  Exception {
		
		File fb=new File("C:/Users/qayyum/Desktop/TestData.xls");
		
		//C:\Users\qayyum\Desktop
		System.out.println("excel located");
		
		Workbook wb=Workbook.getWorkbook(fb);
		
		System.out.println("work book loaded");
		
		int z=wb.getSheet(0).getRows();
		int y=wb.getSheet(0).getColumns();
	
		System.out.println("rows and column " + z +"and column are"+ y);
		
		for(int i=0;i<z;i++)
		{
			
			//String data=wb.getSheet(0).getCell(
			
			/*Thread.sleep(1000);
			
			
			for (int j=0;j<y;j++)
				
			{
			Thread.sleep(1000);
			 
			Object data[][]= new Object[z][y];
			
			 data[i][j]=wb.getSheet(0).getCell(i, j).getContents();
				
				
				System.out.println(data[i][j]);
				   
				*/  
			}
			
		Thread.sleep(2000);
			
		}
			
		
		
		
	/*	
	int z=wb.getSheet(0).getRows();
	int y=wb.getSheet(0).getColumns();
	*/
	
	
	
	}

}
