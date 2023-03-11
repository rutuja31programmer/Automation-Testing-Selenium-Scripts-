package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollRight_Operation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//ImplicitTypeCasting
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//ScrollRight_Operation
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(4000,0)");
	}

}
