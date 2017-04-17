package Libraray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	HSSFWorkbook hb;
	
	
	HSSFSheet sheet;
	
	
	
	public Excel(String excelpath)
	
	{
		
		try {
			File fr=new File(excelpath);
			
			FileInputStream fri=new FileInputStream(fr);
			
			//XSSFWorkbook wb=new XSSFWorkbook(fri);
			
		 hb= new HSSFWorkbook(fri);
			
		
			
			
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
		public String getdata(int sn, int row, int col)
	
	
		{
			 sheet= hb.getSheetAt(sn);
			
		String data9=sheet.getRow(row).getCell(col).getStringCellValue();
			
			return data9;

		}
		
		
		public int gerRow(int sheetIndex)
		
		{
			
			int row= hb.getSheetAt(sheetIndex).getLastRowNum();
			row=row+1;
			
			return row;
		}
		
		
	
	}


	
	
	
	
	
