package keyword_driven_framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActitimeInvalidTestCase extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsn = flib.readExcelData(EXCEL_PATH, "Invalidcreds", i, 0);
			String invalidPass = flib.readExcelData(EXCEL_PATH, "Invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(invalidUsn);
			driver.findElement(By.name("pwd")).sendKeys(invalidPass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			bt.tearDown();
		}
		
	}

}
