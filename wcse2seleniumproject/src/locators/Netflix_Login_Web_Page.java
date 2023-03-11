package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_Login_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("salunkerutuja123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("rutu123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='btn login-button']")).click();
		driver.close();

	}

}
