package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShotOf_WebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//upcast the browser specific classes into web driver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		WebElement seleniumIde = driver.findElement(By.xpath("//h4[.='Selenium IDE']/ancestor::div[@class='card-body']"));
		File src = seleniumIde.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWebElement.jpg");
		
		Files.copy(src, dest);
	}	
	

}
