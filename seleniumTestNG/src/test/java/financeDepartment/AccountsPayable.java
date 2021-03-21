package financeDepartment;

import org.testng.annotations.Test;

import extentTestCases.ExtentReporter;

public class AccountsPayable {
	
	//by default the execution is Alphabetic order
	//-5000 to 5000
	

	@Test (priority=0)
	public void AP_Login() {
		System.out.println("Accounts payable can loggin.");
	}
	
	@Test(priority=1)
	public void AP_ReceivingBills() {
		System.out.println("Accounts payable has received a bill.");
	}
	
	@Test(priority=2)
	public void AP_payBill() {
		System.out.println("Accounts payable paid a Bill.");
	}
	
	@Test(priority=3)
	public void AP_DifferBill() {
		System.out.println("Accounts payable differ a Bill.");
	}
}
