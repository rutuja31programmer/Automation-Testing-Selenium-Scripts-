package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;
//InvocationCount  is execute multiple times test case
//it is to reexecute the test case
public class Flag4 {
	
  @Test(invocationCount=10)
  public void ft() {
	  Reporter.log("FTC is executed",true);
  }
}
