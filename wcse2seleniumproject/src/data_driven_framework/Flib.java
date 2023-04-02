package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//To store generic Reusable methods
	//Flib->File Liberary
	//all the generic reusable methods are nonstatic in nature

	// read the data from excel sheet
		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);//provide the path of file.
			Workbook wb = WorkbookFactory.create(fis);// make the file ready for read
			Sheet sheet = wb.getSheet(sheetName);// get into the sheet
			Row row = sheet.getRow(rowCount);//get the desired row
			Cell cell = row.getCell(cellCount);//get the desired col/cell
			String data = cell.getStringCellValue();// read the data from cell 
			return data;
		}
		
		
		// to get row count
		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			
			int rc = sheet.getLastRowNum();
			return rc;
		}
		
		
		//to write data in excel sheet
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
		}
		
		

	}



