package actions_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Action {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://desktop-vs3484c/login.do");//path of Acti-time
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
	
	WebElement target1 = driver.findElement(By.partialLinkText("Logo & Color Scheme"));
	Actions act = new Actions(driver);
	//To perform mousehover action
	act.moveToElement(target1).perform();
	target1.click();
	Thread.sleep(2000);
	
	 driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	 
	 WebElement target2 = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	
	//To perform doubleclick action
	act.doubleClick(target2).perform();

	
	
	
	}

}
