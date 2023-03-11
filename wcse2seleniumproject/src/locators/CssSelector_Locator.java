package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.cssSelector("input[name^='us']")).sendKeys("Rutuja");
		driver.findElement(By.cssSelector("input[name^='pa']")).sendKeys("rutuja123");
		driver.findElement(By.cssSelector("button[class^='btn login-button']")).click();

	}

}
