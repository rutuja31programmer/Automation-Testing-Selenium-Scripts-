package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Loginpage_ImplicitlyWait {

	public static void main(String[] args)  {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));//To handle Thread.sleep
												//implicitly wait is only applicable for FE & FE's Method
			driver.findElement(By.xpath("//button[.='✕']")).click();
			driver.findElement(By.xpath("//span[.='Cart']")).click();

			driver.findElement(By.xpath("//a[.='Login']")).click();
			driver.quit();
	}

}
