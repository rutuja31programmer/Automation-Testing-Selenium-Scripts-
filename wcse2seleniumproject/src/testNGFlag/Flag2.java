package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
  @Test(description = "This is used to search for Database!!")
  public void search1() {
	  Reporter.log("SQL search",true);
  }
  @Test(description = "This is used to search for Functional test case!!")
  public void search2() {
	  Reporter.log("Log in page",true);
  }
  
}
