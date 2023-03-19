package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingleExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Reading the  single value/data from excel sheet
		FileInputStream fis = new FileInputStream("./data/Test_Data.xlsx"); // provide the path of file
		Workbook wb = WorkbookFactory.create(fis); // make the file ready for read
		Sheet sheet = wb.getSheet("IPL"); // Get into the sheet
		Row row = sheet.getRow(1); // get the desired row
		Cell cell = row.getCell(0);// get the desired column/cell
		String data = cell.getStringCellValue();// read the data from cell
		System.out.println(data);//print the data
	}

}
