package webdriver_methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");//navigate the web application by internally 
															//calling to() method
		
		driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);//switches the control to active element 
											//In google search box search java and hit enter button automatically
		
		driver.navigate().back();//back to the chrome browser
		Thread.sleep(2000);
		driver.navigate().forward();//again navigate the google page
		Thread.sleep(2000);
		driver.navigate().refresh();//refresh the google page
		driver.close();
	}

}
