package healthCarePortal;

import org.testng.annotations.*;

import com.beust.jcommander.Parameters;
@Parameters({"userName", "password"})
public class DoctorPortal {
	
	/*
	 * https://www.softwaretestingmaterial.com/testng-interview-questions/
	 */

	@Test(groups="login", description="This tests the login functionality for the Doctor Portal")
	public void Doctor_Login(String userName, String password) {
		System.out.println("Doctor has logged in as: " + userName + " with Password: " + password);
	}


	@Test (enabled= false)
	public void Doctor_AddRX() {
		System.out.println("Doctor has added RXs");
	}
	@Test
	
	public void Doctor_UpdateRX() {
		System.out.println("Doctor has updated RXs");
	}
	@Test(dependsOnMethods="Doctor_ReadEmails", description="the docutor can upload after reading emails")
	
	public void Doctor_UploadTestResults() {
		System.out.println("Doctor has uploaded Test results");
	}
	@Test
	public void Doctor_ReadEmails() {
		System.out.println("Doctor can read emails");
	}
	@Test
	public void Doctor_Send() {
		System.out.println("Doctor can send emails");
	}
	
	//Other annotations
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Before Suite method excuted");
	}
	
	
	@BeforeSuite
	public void beforeTestMethod() {
		System.out.println("Before Test method excuted");
	}
	
	@BeforeSuite
	public void beforeClassMethod() {
		System.out.println("Before method excuted");
	}
	
	@BeforeSuite(groups="known-bug")
	public void beforeMethod() {
		System.out.println("Before Suite method excuted");
	}
	
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("After Suite method excuted");
	}
	
	
	@AfterMethod
	public void afterTestMethod() {
		System.out.println("After method excuted");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("after class excuted");
	}
	
	@AfterTest
	public void afterMethod() {
		System.out.println("After test method excuted");
	}
	
}
