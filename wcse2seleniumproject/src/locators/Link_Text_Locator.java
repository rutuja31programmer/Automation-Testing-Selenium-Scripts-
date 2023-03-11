package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/selenium%20link.html");
																//path of selenium link.html file
		driver.findElement(By.linkText("selenium")).click();//Identify link based on complete text of the link
															//absolute path of link
	}

}
