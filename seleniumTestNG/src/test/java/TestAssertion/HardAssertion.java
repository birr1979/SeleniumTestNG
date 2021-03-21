package TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners (TestNG_listeners.class)

public class HardAssertion {
	//hard assertion stop excetuion if failer happens
	//soft assertion will excution continues and record failures
	
	@Test
	public void validate() {
		String actual="actual";
		String expected="expected";
		Assert.assertEquals(actual, expected,"Test is not as expected");
		System.out.println("assertion test***************8888888888888");
	}
	@Test
	public void validategoogle() {
		String actual="google";
		String expected="google";
		Assert.assertEquals(actual, expected,"Test is not as expected");
		System.out.println("assertion test has ended ************");
	}
	

}
