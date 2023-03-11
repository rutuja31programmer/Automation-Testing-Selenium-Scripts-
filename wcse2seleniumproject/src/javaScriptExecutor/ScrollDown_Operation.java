package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollDown_Operation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();//upcast browser specific classes(edge driver)into web driver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		// Access method //ExplicitTypeCasting //downcasting
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//ScrollDown Operation
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		
	}

}
