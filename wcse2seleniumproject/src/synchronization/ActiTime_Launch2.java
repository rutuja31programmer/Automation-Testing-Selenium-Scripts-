package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Launch2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-vs3484c/login.do");
		
		String LoginPageActualTitle = driver.getTitle();
		
		if(LoginPageActualTitle.equals("actiTIME - Login"))
		{
			System.out.println("Test is passed login page verified!");
		}
		
		
		else
		{
			System.out.println("Test is failed login page not verified");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		String HomepageActualTitle = driver.getTitle();
		
		if(HomepageActualTitle .equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Test is passed home page verified!");

		}
		else
		{
			System.out.println("Test is failed home page not verified!");

		}
	}

}
