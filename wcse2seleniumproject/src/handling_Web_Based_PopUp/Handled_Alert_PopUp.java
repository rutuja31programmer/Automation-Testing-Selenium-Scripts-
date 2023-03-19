package handling_Web_Based_PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handled_Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/Alert%20popup.html");//path of alert popup html file
		//Generate alert popup
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		//switch the control to Alert Popup
		Alert al = driver.switchTo().alert();
		
		//handled the Alert popup
		Thread.sleep(2000);
		al.accept();
		//al.dismiss();  //dismiss the alert popup
		//System.out.println(al.getText());  //get the text of alert popup and print it
		//al.sendKeys("aaaa");   //pass the characters to alert popup
	}

}
