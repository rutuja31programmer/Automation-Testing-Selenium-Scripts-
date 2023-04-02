package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

//if any kind of exception is occur or we cannot skip any method that time we can used always run method(boolean)
//dependsonMethods->depends on other method
public class Flag7 {
	
  @Test
  public void login() {
	  int res=5/0;
	  Reporter.log("login method",true);
  }
  @Test(dependsOnMethods = "login",alwaysRun = true)
  public void createuser()
  {
	  Reporter.log("CreateUserMethod",true);
  }
  @Test
  public void logout()
  {
	  Reporter.log("logout method",true);
  }
}
