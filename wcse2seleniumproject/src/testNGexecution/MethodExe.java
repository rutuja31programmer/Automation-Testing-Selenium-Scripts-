package testNGexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;
//Parallel execution with the help of threads

public class MethodExe {
  @Test
  public void method1() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" is the threadId",true);
	  Reporter.log("Method1",true);
  }
  @Test
  public void method2() {
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" is the threadId",true);
	  Reporter.log("Method2",true);
}
}