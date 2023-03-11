package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); //To avoid IllegalStateException
		WebDriver driver = new ChromeDriver(); // created object for chrome driver upcasted into webdriver interface
												//launch chrome browser
		driver.manage().window().maximize(); //method chaining maximize the browser
		Thread.sleep(3000);//delay for 3 second to launch facebook webpage
		driver.get("https://www.facebook.com/facebook/");//To launch web application(facebook webpage)
		Thread.sleep(3000);//delay for 3 second  to close parent browser(facebook web page)
							//occuring exception we have to handle by using throws
		driver.close();
	}

}
