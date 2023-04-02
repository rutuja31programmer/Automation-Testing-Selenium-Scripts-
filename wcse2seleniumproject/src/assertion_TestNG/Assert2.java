package assertion_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	static WebDriver driver;
  @BeforeMethod
  public void launchBrowser() {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(co);
	  driver.manage().window().maximize();
	  driver.get("http://desktop-vs3484c/login.do");
  }
  
  @Test
  public void login() throws InterruptedException
  {
	  //soft assert used in critical feature
	  //flow of execution is continue even if wrong actual login page title
	  String actualLoginpageTitle = driver.getTitle();
	  SoftAssert sa = new SoftAssert();//Soft Assert
	  sa.assertEquals(actualLoginpageTitle, "loginpage");
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  
	  //Hard assert
	  //if wrong actual home page title then not continue flow of execution
	  //if right actual home page title then  continue flow of execution
	  String actualHomepageTitle = driver.getTitle();
	  Assert.assertEquals(actualHomepageTitle,"actiTIME - Enter Time-Track");//hard assert
	  driver.findElement(By.className("logout")).click();
	  Thread.sleep(2000);
	  sa.assertAll();
	  
	  
	  
  }
  @BeforeTest
  public void property()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver1.exe");
	 
  }
}
