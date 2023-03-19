package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC_Train_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8 ui-inputtext ui-widget ')]")).sendKeys("pune");
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'and(text()='PUNE JN - PUNE')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui-inputtext ui')]")).sendKeys("mumbai");
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted'and(text()='MUMBAI CENTRAL - MMCT')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58')]")).click();
		driver.findElement(By.xpath("//a[.='12']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-11 ui-dropdown ')]")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'and(text()='AC First Class (1A) ')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all')]")).click();
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'and(text()='LADIES')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[.='Flexible With Date']")).click();
		driver.findElement(By.xpath("//button[.='Search']")).click();
	}

}
