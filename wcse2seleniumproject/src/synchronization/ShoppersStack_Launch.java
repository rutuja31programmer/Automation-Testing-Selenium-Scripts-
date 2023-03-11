package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStack_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//a[@id='kids']")).click();

		WebElement santoor = driver.findElement(By.xpath("//div[@class='featuredProducts_cardBody__l4gLE']/descendant::img[@alt='Santoor']"));
		santoor.click();
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("410033");
		//Explicitly wait
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	    WebElement checkButton = driver.findElement(By.xpath("//button[.='Check']"));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();
	}

}
