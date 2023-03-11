package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;


public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		//TakesScreenShot-way 1  create of browser specific classes no need to upcast into webdriver interface.
		EdgeDriver driver=new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/ssWay1.jpg");//Relative path of ScreenShots
		
		Files.copy(src, dest);
				
	}

}
