package handling_frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Bluestone_Script {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	//Handled hidden division popup
	driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	//switch the controls to frame
	WebElement frameElement = driver.findElement(By.id("fc_widget"));
	driver.switchTo().frame(frameElement);
	Thread.sleep(2000);
	WebElement chatBox = driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']"));
	chatBox.click();
	driver.switchTo().parentFrame();
	WebElement nameTB = driver.findElement(By.id("chat-fc-name"));
	nameTB.sendKeys("Admin");
	

	}

}
