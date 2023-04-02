package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void dm1() {
	  int a=10;
	  int b=0;
	  int res=a/b;
	  Reporter.log("method name is dm1"+res, true);
  }
  @Test
  public void dm2()
  {
	  Reporter.log("method name is dm2",true);
  }
  @Test
  public void dm3()
  {
	  Reporter.log("method name is dm3",true);
  }
}
