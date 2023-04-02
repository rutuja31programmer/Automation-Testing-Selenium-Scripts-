package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");//parent window
		driver.findElement(By.xpath("//button[.='✕']")).click();//handled hidden division popup	
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();//Child window
		
		Set<String> allHandles = driver.getWindowHandles();
		 for(String wh:allHandles)//if parent address not equal to child address ->condition false and we will get true condition
			 					 //because of we used not operator and then execute it
		 {
			 if(!parentHandle.equals(wh))
			 {
				driver.switchTo().window(wh);
				
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[.='512 GB']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='_36yFo0']")).sendKeys("411033");
				driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[@class='col col-6-12']/descendant::button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[.='Remove']"));
			 }
			 else
			 {
				 
			 }
			 
		 }
		 
		 
	}

}
