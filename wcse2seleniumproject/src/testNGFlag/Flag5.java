package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;
//depends on methods

public class Flag5 {
  @Test
  public void login() {
	  Reporter.log("Logged in!!",true);
  }
  @Test(dependsOnMethods = "login")
  public void createUser()
  {
	  Reporter.log("User is created!!",true);

  }
  @Test(dependsOnMethods = "createUser")
  public void logOut()
  {
	  Reporter.log("Logged out!!",true);

  }
}
