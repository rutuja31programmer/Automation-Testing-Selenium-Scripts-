package webdriver_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> options= driver.findElements(By.xpath("//div[@class='wM6W7d']"));//To find multiple(list) of 
																					//web element on web page
		for(int i=0;i<options.size();i++)//used for loop
		{
			WebElement opt=options.get(i);//To get list of web element
			String iphones = opt.getText();//To get text of web element
			System.out.println(iphones);
			Thread.sleep(2000);
		}
		 
	}

}
