package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/uername.html");//path of username.html file
		 driver.findElement(By.id("i1")).sendKeys("Rutuja Salunke");//Identifying the web element on web page
		 Thread.sleep(2000);
		 driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/password.html");//path of password.html file
		 driver.findElement(By.id("i1")).sendKeys("Rutujasa@31");//Identifying the web element on web page
		 
		 
	}

}
