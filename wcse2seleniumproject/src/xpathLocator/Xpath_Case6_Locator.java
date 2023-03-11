package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Case6_Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();//To handle PopUp, close popup
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptops");//To search Laptops in text field
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//To handle search icon (click on search)
		Thread.sleep(2000);
		//To apply filters
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i7']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Brand'and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='DELL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Screen Size'and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='14 inch - 14.9 inch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Operating System'and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Windows 11']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[.='Customer Ratings'and(@class='_2gmUFU _3V8rao')]")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='4★ & above']")).click();
		Thread.sleep(2000);
		//price of first suggestion
		String PriceOfLaptop = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		System.out.println(PriceOfLaptop);
		Thread.sleep(2000);
		driver.quit();
	}

}
