package data_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
	//all the generic reusable methods are non-static in nature

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
		
		
		// to get last row count
		public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);//provide the path of file
			Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
			Sheet sheet = wb.getSheet(sheetName);//get into sheet
			
			int rc = sheet.getLastRowNum();//get last row number
			return rc;
		}
		
		
		//to write data in excel sheet
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);//provide the path of file
			Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
			Sheet sheet = wb.getSheet(sheetName);//get into sheet
			Row row = sheet.getRow(rowCount);//get desired row
			
			Cell cell = row.createCell(cellCount);//create new cell/column
			cell.setCellValue(data);//pass the data to created new cell
			
			FileOutputStream fos = new FileOutputStream(excelPath);//to write
			wb.write(fos);// write the data // make the file ready for write
		}
		
		

	}



