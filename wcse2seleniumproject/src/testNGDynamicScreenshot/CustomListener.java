package testNGDynamicScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

// ITestListener interface helps in execution

public class CustomListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test is start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) { //which method failed we can identified that
		
		//This implementation is responsible for which method is failed
		
		String failedMethod = result.getMethod().getMethodName();//give method id which is failed
		Reporter.log("This is failed method"+failedMethod+"ScreenShot is taken",true);
		failedMethod(failedMethod);//Call take screenshot method
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("@Test annotation start execution",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test Finshed",true);

		
	}
	

}
