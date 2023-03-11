package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); //To avoid IlleglStateException
		WebDriver driver=new ChromeDriver();    //Launch the chrome browser
		driver.manage().window().maximize(); //method chaining maximize the browser
		driver.get("https://omayo.blogspot.com/");   //get() method under chrome browser open omayo link
													// launch web application using get method
		Thread.sleep(5000);//delay for 5 second to close parent(omeyo web page)
								//occuring exception we have to handle by using throws
		driver.close();    //close only parent browser(chrome browser)

	}

}
