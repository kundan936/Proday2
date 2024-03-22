package Parametters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUilities {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
 
	public ExcelUilities(String ExcelFilePath)  {
		try {
		File fldata = new File(ExcelFilePath);
		FileInputStream Fis=new FileInputStream(fldata);
		wb = new XSSFWorkbook(Fis);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int sheetno,int rowno,int cellno) {
		 sheet= wb.getSheetAt(sheetno);
		 //DataFormatter formatter = new DataFormatter();
		 String data = sheet.getRow(rowno).getCell(cellno).getStringCellValue();
		 return data;
	}
	public int getRowCount(int wsIndex) {
	int row = wb.getSheetAt(wsIndex).getLastRowNum();
	return row;
	}
}
