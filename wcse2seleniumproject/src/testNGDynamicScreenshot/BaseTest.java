package testNGDynamicScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;

	public void initialization ()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vs3484c/login.do");
	}
	public void failedMethod(String methodName)
	{
		try//Exception occurs StaleElementReferenceException
		{
			//Taking Screenshot method
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./ScreenShots/"+methodName+".jpg");
			Files.copy(src, dest);
		}
		catch(Exception e)//handle exception
		{
			
		}
		
	}
	public void close()
	{
		driver.quit();
	}

}
