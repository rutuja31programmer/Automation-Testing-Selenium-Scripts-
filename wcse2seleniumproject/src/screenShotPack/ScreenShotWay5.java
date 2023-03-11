package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShotWay5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedge.exe");
		WebDriver driver=new EdgeDriver();//upcast browser specific class into web driver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Way 5 downcast TakesScreenShot class//Explicit type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		driver.get("https://petstore.swagger.io/");
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/ssWay5.jpg");//To store the screenshot in folder
	
		Files.copy(src, dest);
	}

}
