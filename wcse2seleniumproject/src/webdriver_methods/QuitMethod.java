package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();   //Launch the edge browser //parent browser
		driver.manage().window().maximize();   //method chaining maximize the browser
		driver.get("https://omayo.blogspot.com/");   //get() method under chrome browser open omayo webpage
		driver.findElement(By.xpath("//a[.='Open a popup window)")).click();
		Thread.sleep(2000);  //delay for 2 second to close parent & child browser
								//occuring exception we have to handle by using throws
		driver.quit();    //close parent as well as child browser
		driver.close();    //close only parent browser(chrome browser)
		

		
		

	}

}
