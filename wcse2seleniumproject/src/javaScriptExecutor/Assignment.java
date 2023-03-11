package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		//Get location locate web element
		//Java script executor
		//get x and y axis window.scrollBy(x,y)
		//perform scrolldown and scrollup operation
	}

}
