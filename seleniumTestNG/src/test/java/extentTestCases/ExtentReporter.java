package extentTestCases;

import java.io.UnsupportedEncodingException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	public ExtentSparkReporter sr;
	public ExtentReports e;
	public ExtentTest t;


	@BeforeTest
	public void configRepo() throws UnsupportedEncodingException {
		sr= new ExtentSparkReporter(System.getProperty("user.dir")+"//extent.html");
		sr.config().setEncoding("utf-8");
		sr.config().setDocumentTitle("BirrProduction MMW's");
		sr.config().setReportName("BIRRPRODUCTION MMWS");
		sr.config().setTheme(Theme.DARK);

		e= new ExtentReports();
		e.attachReporter(sr);
		e.setSystemInfo("Automation Engineer", "Birhanu Sendek");
		e.setReportUsesManualConfiguration(true);
		e.setSystemInfo("Company", "user, company name will appear here.");

	}


	//this is where we implement the extent report 


	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE){
			String logText="<b>"+"TestCase: "+result.getMethod().getMethodName().toUpperCase()+" FAILED" +"<b>";
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.RED);
			t.fail(m);

		}else if (result.getStatus()==ITestResult.SUCCESS) {
			String logText="<b>"+"TestCase: "+result.getMethod().getMethodName().toUpperCase()+" PASSED " +"<b>";
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			t.pass(m);

		}else if (result.getStatus()==ITestResult.SKIP) {
			String logText="<b>"+"TestCase: "+result.getMethod().getMethodName().toUpperCase()+" SKIPPED" +"<b>";
			Markup m= MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			t.skip(m);

		}
	}


	@AfterTest
	public void endReporter() {
		e.flush();
	}


	static int x;


	@Test
	public void case1() {
				x++;
		System.out.println("I am the test ");
	}

	@Test
	public void cas2() {
		//		x++;
//		System.out.println("I am the test ");
//		//		throw new SkipException("its skipped by me");
	}


	@Test
	public void case3() {

		System.out.println("I am the test ");
				Assert.assertEquals("name", "myname");
	}



















}
