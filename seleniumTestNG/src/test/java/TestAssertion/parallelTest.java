package TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.TestNG_listeners;


@Listeners (TestNG_listeners.class)
public class parallelTest {//running tests at the same time
	//hard assertion stop excetuion if failer happens
	//soft assertion will excution continues and record failures
	public static SoftAssert SoftAssert;
	@Test
	public void validateme() {
		
		SoftAssert=new SoftAssert();
		String actual="actual";
		String expected="expected";
		SoftAssert.assertEquals(actual, expected,"Test is not as expected");
		System.out.println("assertion test***************8888888888888");
		SoftAssert.assertAll();
	}
	@Test
	public void validategoogle() {
	
		SoftAssert=new SoftAssert();
		String actual="google";
		String expected="google";
		SoftAssert.assertEquals(actual, expected,"Test is 888888888888888 as expected");
		System.out.println("assertion test has ended ************");
		SoftAssert.assertAll();

	}
	

}
