package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RTP_Script {
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Which browser you want to open:");
		String browservalue = s.next();

		if(browservalue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browservalue.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Enter valid browservalue");
		}

	}

}
