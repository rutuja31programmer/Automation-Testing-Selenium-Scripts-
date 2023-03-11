package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");//navigate the web application by internally calling to() method
		driver.navigate().back();//back to the chrome browser
		Thread.sleep(2000);
		driver.navigate().forward();// go(navigate) to again selenium web page 
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh the selenium web page
	}

}
