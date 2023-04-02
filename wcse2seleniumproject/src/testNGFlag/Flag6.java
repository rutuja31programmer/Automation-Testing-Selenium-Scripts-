package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;
//Enabled methods
//By using Enabled methods we can enabled method
//By using Enabled methods we can skip any method
public class Flag6 {

	
  @Test(enabled = true)
  public void login() {
	  Reporter.log("Login method",true);
  }
  @Test(enabled = true)
  public void logout() {
	  Reporter.log("Logout method",true);
  }
  //---------------------------------------------------------------------------
  //By using Enabled methods we can disable method
  @Test(enabled=false)
  public void login1() {
	  Reporter.log("Login method",true);
  }
  @Test(enabled = true)
  public void logout1() {
	  Reporter.log("Logout method",true);
  }
}
