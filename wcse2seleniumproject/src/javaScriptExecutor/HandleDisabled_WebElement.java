package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleDisabled_WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/uername.html");//path of username html.file
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("(document.getElementById('i1').value='admin')");

	}

}
