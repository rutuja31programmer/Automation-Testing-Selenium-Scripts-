package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	//close all the browser/windows(parent and child) without using quit method
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://omayo.blogspot.com/");//parent window/browser
		 
		 driver.findElement(By.linkText("Open a popup window")).click();//child/window browser
		 Thread.sleep(2000);
		 Set<String> allHandles = driver.getWindowHandles();
		 for(String wh:allHandles)
		 {
			 driver.switchTo().window(wh).close();
		 }
	}

}
