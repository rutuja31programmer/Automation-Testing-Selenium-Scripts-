package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[.='Processor'and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(text()='Brand')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='HP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Screen Size')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='14 inch - 14.9 inch']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Operating System')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 10']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and(.='Hard Disk Capacity')]")).click();
		//driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='2 TB']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
		
	}

}
