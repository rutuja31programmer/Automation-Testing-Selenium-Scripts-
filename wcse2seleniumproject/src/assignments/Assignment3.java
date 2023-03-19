package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {

	//how to close only parent browser/window
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");//parent window/browser
		driver.findElement(By.linkText("Open a popup window")).click();//child/window browser

		driver.close();
		
	}

}
