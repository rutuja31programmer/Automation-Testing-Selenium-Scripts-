package assertion_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert1 {
  @Test
  public void validLogin() {
	  Reporter.log("launch the browser",true);
	  Reporter.log("launch the web app by using url",true);
	  
	  //Soft assert
	  //condition false even if method will get execute in soft assert
	  //create object is required in soft assert
	  
	  SoftAssert sa = new SoftAssert();//Soft Assert
	  sa.assertEquals(false, true);
	  Reporter.log("log in page will be display",true);
	  Reporter.log("perform the login operation",true);
	  
	  //hard assert
	  //if you want to failed method intentionally we can use hard assert
	  //condition false then  method will not get executed in soft assert
	  //create object is not  required in hard assert

	  
	  //Assert.assertEquals(true, false);//Hard Assert
	  
	  Assert.assertEquals(true, true);//Hard Assert
	  Reporter.log("Home page will display",true);
	  Reporter.log("log out",true);

  }
}
