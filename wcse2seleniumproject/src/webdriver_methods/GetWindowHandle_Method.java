package webdriver_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandle_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://omayo.blogspot.com/");//parent window/browser
		 String parentHandle = driver.getWindowHandle();
		 System.out.println("This is the address of parent window:"+parentHandle);//Address of parent window
		 										//5D8A15AF71DA6BFAAFF51E27C9F3264B
		 driver.findElement(By.linkText("Open a popup window")).click();//child/window browser

		 
		 
		 
	}

}
