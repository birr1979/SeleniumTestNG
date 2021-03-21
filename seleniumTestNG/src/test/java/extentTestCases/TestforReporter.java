package extentTestCases;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestforReporter{
	static int x;
	

	@Test
	public void case1() {
		x++;
		System.out.println("I am the test "+x);
	}
	
	@Test
	public void cas2() {
		x++;
		System.out.println("I am the test "+x);
		throw new SkipException("its skipped by me");
	}
	
	
	@Test
	public void case3() {
		x++;
		System.out.println("I am the test "+x);
		Assert.assertEquals("name", "myname");
	}
}
