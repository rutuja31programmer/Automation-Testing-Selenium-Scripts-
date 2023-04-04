package keyword_driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//To store generic reusable method
	
	//generic reusable method to read the data from excel sheet
	
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of file
		Workbook wb = WorkbookFactory.create(fis);	//make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);	//get into sheet
		Row row = sheet.getRow(rowCount);	//get the desired row
		Cell cell = row.getCell(cellCount);	//get the desired cell/column
		String data = cell.getStringCellValue(); //read the data from cell
		
		return data;
		
	}
	
	//generic reusable method for get last row count
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);	//provide the path of file
		Workbook wb = WorkbookFactory.create(fis);	//make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);	//get into sheet
		int rc = sheet.getLastRowNum();		//get last row number
		return rc;
	}
	
	//generic reusable method to write the data in excel sheet
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);	//To provide path of file
		Workbook wb = WorkbookFactory.create(fis);	//make the file ready for read
		Sheet sheet = wb.getSheet(sheetName);	//get into sheet
		Row row = sheet.getRow(rowCount);	//get desired row
		Cell cell = row.createCell(cellCount);//get desired cell/column to write data 
		cell.setCellValue(data);//to get created cell name
		
		FileOutputStream fos = new FileOutputStream(excelPath);//to write
		wb.write(fos);// make the file ready for write
	}
	
	//generic reusable method to read the data from property(config.properties) file
	public String readPropertyData(String propPath,String key) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}

}
