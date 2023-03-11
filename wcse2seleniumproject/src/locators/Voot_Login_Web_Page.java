package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Voot_Login_Web_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://elogin.voot.com/views/login.html");
		driver.findElement(By.id("email")).sendKeys("salunkerutuja80@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button[class^='btn login']")).click();

	}

}
