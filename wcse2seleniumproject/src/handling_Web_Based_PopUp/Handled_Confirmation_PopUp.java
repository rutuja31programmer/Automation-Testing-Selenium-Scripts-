package handling_Web_Based_PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handled_Confirmation_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/Confirmation%20popup.html");//path of confirmation popup html file
		 //generate confirmation popup
		 driver.findElement(By.tagName("input")).click();
		 //switch the control to confirmation popup
		 Alert al = driver.switchTo().alert();
		 Thread.sleep(2000);
		 al.accept();
		 //al.dismiss();
		 //System.out.println(al.getText());
		 //al.sendKeys("aaaa");
	}

}
