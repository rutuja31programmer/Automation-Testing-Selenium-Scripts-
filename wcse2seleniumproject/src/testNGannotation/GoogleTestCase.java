package testNGannotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleTestCase extends BaseTest{
  @Test
  public void search1() throws InterruptedException {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test
  
  public void search2() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test
  public void search3() throws InterruptedException {
	  driver.switchTo().activeElement().sendKeys("TestNG",Keys.ENTER);
	  Thread.sleep(2000);
  }
  
}
