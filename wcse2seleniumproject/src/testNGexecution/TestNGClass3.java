package testNGexecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNGClass3 extends BaseTest{
  @Test
  public void Search3() {
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
