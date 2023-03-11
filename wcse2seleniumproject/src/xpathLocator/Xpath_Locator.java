package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("rutu123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rutu123");
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}

}
