package testNGexecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//Parameterization
//Achieve data driven framework(approach) by using TestNG

public class ActitimeValidLogin {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","username","password"})
  public void validLogin(String browser,String url,String username,String password) throws InterruptedException 
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
		  
		  ChromeOptions co	= new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("username")).sendKeys("username");
		  driver.findElement(By.name("pwd")).sendKeys("password");
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000);

	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver","./drivers/msedge.exe");
		  

		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  
		  driver.findElement(By.name("username")).sendKeys("username");
		  driver.findElement(By.name("pwd")).sendKeys("password");
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
  }
	  @AfterMethod
	  public void close()
	  {
		  driver.quit();
	  }
  
}
