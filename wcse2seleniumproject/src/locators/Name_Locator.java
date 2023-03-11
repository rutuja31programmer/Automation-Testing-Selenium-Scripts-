package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rutuja/Desktop/Selenium%20Data/Web%20Element/RadioButton.html");//path of Radiobutton html file
		driver.findElement(By.name("n1")).click();//Identifying the web element on web page
		driver.findElement(By.name("n2")).click();//Identifying the web element on web page
		driver.findElement(By.name("n3")).click();
		driver.findElement(By.name("n4")).click();
		
	}

}
