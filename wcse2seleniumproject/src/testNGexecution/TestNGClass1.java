package testNGexecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestNGClass1 extends BaseTest{
  @Test
  public void Search1() {
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
  }
}
