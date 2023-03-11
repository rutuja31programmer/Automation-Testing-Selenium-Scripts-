package keyboard_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args)   throws AWTException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.calculator.net/");
		
		// to access method of keyBoard crate obj of Robot class
		
		        Robot robot = new Robot();
		      
		        // generate print pop up
		        
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_P);
		  
		        
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyRelease(KeyEvent.VK_P);
	}

}
