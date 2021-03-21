package TestAssertion;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


//@Listeners (TestNG_Listeners.class)

public class SoftAssertion {
	//hard assertion stop excetuion if failer happens
	//soft assertion will excution continues and record failures
	public static SoftAssert SoftAssert;
	
	@Test
	public void validate() {
		SoftAssert=new SoftAssert();
		String actual="actual";
		String expected="actual";
		SoftAssert.assertEquals(actual, expected,"Test is not as expected");
		System.out.println("assertion test");
		SoftAssert.assertAll(); //must be at last
	}

}
