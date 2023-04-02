package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

//priority
//Flag is annotation ->perform test cases
//if the priority is zero(priority is not declare by default it will get ->zero) it will get alphabetical order
//same(1,1) priorities test case will get executed alphabetically
//high priority will get execute  first
//negative priority will get execute first

public class Flag3 {
	
  @Test(priority = 1)
  public void login() {
	  Reporter.log("Logged in!!",true);
  }
  @Test(priority = 2)
  public void createUser()
  {
	  Reporter.log("User is created",true);
  }
  @Test(priority = 3)
  public void logOut()
  {
	  Reporter.log("Logged out!!",true);
  }
}
