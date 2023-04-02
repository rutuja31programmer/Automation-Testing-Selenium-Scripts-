package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Group Execution
public class GroupExecution {
	
  @Test(groups = "FUNCTIONAL")
  public void ft1() {
	  Reporter.log("Functional test case1 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st1()
  {
	  Reporter.log("Smoke test case1 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it1()
  {
	  Reporter.log("Integration test case1 is executed",true);

  }
  
  //-----------------------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() {
	  Reporter.log("Functional test case2 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st2()
  {
	  Reporter.log("Smoke test case2 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it2()
  {
	  Reporter.log("Integration test case2 is executed",true);

  }
  //------------------------------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() {
	  Reporter.log("Functional test case3 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st3()
  {
	  Reporter.log("Smoke test case3 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it3()
  {
	  Reporter.log("Integration test case3 is executed",true);

  }
  //----------------------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft4() {
	  Reporter.log("Functional test case4 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st4()
  {
	  Reporter.log("Smoke test case4 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it4()
  {
	  Reporter.log("Integration test case4 is executed",true);

  }
  //---------------------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft5() {
	  Reporter.log("Functional test case5 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st5()
  {
	  Reporter.log("Smoke test case5 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it5()
  {
	  Reporter.log("Integration test case5 is executed",true);

  }
  //------------------------------------------------------------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft6() {
	  Reporter.log("Functional test case6 is executed",true);
  }
  @Test(groups = "SMOKE")
  public void st6()
  {
	  Reporter.log("Smoke test case6 is executed",true);

  }
  @Test(groups = "INTEGRATION")
  public void it6()
  {
	  Reporter.log("Integration test case6 is executed",true);

  }
  
}
