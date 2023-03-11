package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //To avoid IlleglStateException
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/uername.html");//path of uername.html file
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");//tagname is used to identify webelement on webpage
	}

}
