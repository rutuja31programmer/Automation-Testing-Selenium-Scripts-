package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunTimePolymorphismScript {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the required browser:");
		String browservalue=sc.next();
		
		if(browservalue.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //avoid IllegalStateexception
			WebDriver driver = new ChromeDriver();   //upcasted //Launch the chrome browser
			driver.manage().window().maximize();   //maximize the browser
		}
		else if(browservalue.equals("edge")) {
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");   //avoid IllegalStateexception
			WebDriver driver = new EdgeDriver();   //upcasted  //Launch the edge browser
			driver.manage().window().maximize();   //maximize the browser
		}
		else {
			System.out.println("Select the valid browser");
		}
			

	}

}
