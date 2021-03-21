package financeDepartment;

import org.testng.annotations.Test;

public class AccountsReceivable {
	
	@Test(enabled=false)//by default is True and  its a helper attribute
	public void AR_Login() {
		System.out.println("Accounts rep has logged in.");
	}
	
	@Test
	public void AR_CreateInvoice() {
		System.out.println("Accounts rep has created Invoices.");
	}
	
	
	@Test(timeOut=2000)//time out with if its not executed in the specefid time
	public void AR_SendInvoices() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Accounts rep has sent the Invoices.");
	}
	
	@Test
	public void AR_() {
		System.out.println("Accounts rep has logged in.");
	}
	
	
	
}
