package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementReferenceException {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("http://desktop-vs3484c/login.do");
		 
		 WebElement usn = driver.findElement(By.name("username"));
		 usn.sendKeys("admin");
		 
		 System.out.println(usn);
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 usn.sendKeys("admin");
		 System.out.println(usn);
		 
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 
		 //usn.clear();
		 //System.out.println(usn);
		// usn.sendKeys("admin");
		
	}

}
