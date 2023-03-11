package actions_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=Cj0KCQiA9YugBhCZARIsAACXxeKqcfWdi0ozlSF52s9wOtPJTZc8Ymemtn4U0eMl0U13nfodkuQo2I0aAolWEALw_wcB");
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery ')]"));	
		
		//To perform mouse action create object of actions class
		Actions act = new Actions(driver);
		
		//To perform mouseHover action
		//act.moveToElement(target).perform();
		act.moveToElement(target).build().perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click();
	}

}
