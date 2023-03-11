package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/CheckBox.html");
		WebElement automationcheckbox = driver.findElement(By.id("i4"));//To find single web element on web page
		System.out.println(automationcheckbox);
		automationcheckbox.click();//To get address of id and print it
	}

}
