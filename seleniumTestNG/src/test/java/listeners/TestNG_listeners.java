package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_listeners implements ITestListener{

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
System.out.println("***********Test Passed***********"+result);
	}
	public void onTestFailuere(ITestResult result) {
System.out.println("***********Test Failed ***********"+result);

	}
	public void onTestSkipped(ITestResult result) {

	}
	public void onStart(ITestContext result) {
		System.out.println("Test Started###############");

	}




}
