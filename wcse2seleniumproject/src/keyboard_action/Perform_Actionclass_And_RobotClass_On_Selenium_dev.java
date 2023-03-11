package keyboard_action;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_Actionclass_And_RobotClass_On_Selenium_dev {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		WebElement we = driver.findElement(By.xpath("//h4[.='Selenium IDE']"));
		//Actions class
		Actions act = new Actions(driver);
		for(int i=0;i<6;i++)
		{
			act.clickAndHold(we).perform();
		}
		//Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.xpath("//span[@class='DocSearch-Button-Placeholder']")).click();
	   WebElement we1=driver.findElement(By.xpath("//input[@placeholder='Search docs']"));
	   Thread.sleep(2000);
	   we1.clear();

		Thread.sleep(2000);
		we1.click();

	   
	   //robot.keyPress(KeyEvent.VK_CONTROL);
	   //robot.keyPress(KeyEvent.VK_V);
		
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		//robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);			
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}