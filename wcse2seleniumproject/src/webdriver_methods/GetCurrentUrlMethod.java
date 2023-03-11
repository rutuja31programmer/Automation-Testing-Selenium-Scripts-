package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");//To launch web page
		//String InstaCurrentUrl = driver.getCurrentUrl();//To get current url of web page(instagram)
		//System.out.println(InstaCurrentUrl);
		System.out.println(driver.getCurrentUrl());//print url of current web page(instagram)
	}

}
