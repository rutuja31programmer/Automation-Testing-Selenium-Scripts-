package screenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//upcast browser specific class into web driver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Way 4 create the object of EventFiringWebDriver class
		EventFiringWebDriver evw = new EventFiringWebDriver(driver);
		driver.get("https://www.selenium.dev/");
		File src = evw.getScreenshotAs(OutputType.FILE);//OutputType is interface,File-stores jpg
		File dest = new File("./ScreenShots/ssWay4.jpg");
		
		Files.copy(src, dest);
		
	}

}
