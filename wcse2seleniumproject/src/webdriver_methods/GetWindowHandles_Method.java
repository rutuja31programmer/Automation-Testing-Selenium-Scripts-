package webdriver_methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandles_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://omayo.blogspot.com/");//parent window/browser
		 String parentHandle = driver.getWindowHandle();
		 System.out.println("This is the address of parenwindow:"+parentHandle);//Address of parent window
		 										//CCA30CDB42B4AFC598414A2D18207E15
		 driver.findElement(By.linkText("Open a popup window")).click();//child/window browser
		 Set<String> allHandles = driver.getWindowHandles();
		 for(String wh:allHandles)
		 {
			 System.out.println("This is the address of all windows:"+wh);//Address of all windows
			 										//6448BDB3A4FB51B3C95FD4A7D6533282
		 }
	}

}
