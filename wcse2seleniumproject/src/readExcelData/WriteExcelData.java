package readExcelData;

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

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To write data in excel
		FileInputStream fis = new FileInputStream("./data/Test_Data.xlsx");//To provide path of the file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(0);//get desired row
		Cell cell = row.createCell(2);//create desired cell/column //to write data 
		cell.setCellValue("Status");//get created cell name
		
		//Row row2=sheet.getRow(4);
		//Cell cell2=row.getCell(2);
		//cell2.setCellValue("Pass");
	
		FileOutputStream fos = new FileOutputStream("./data/Test_Data.xlsx");
		wb.write(fos);//make the file ready for write
		
		
	}

}
