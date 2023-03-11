package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver= new EdgeDriver();//upcast the browser specific classes into web driver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		//Way2 downcast into remote web driver class
		RemoteWebDriver rw = (RemoteWebDriver)driver;
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay2.jpg");
		
		Files.copy(src, dest);
	}

}
