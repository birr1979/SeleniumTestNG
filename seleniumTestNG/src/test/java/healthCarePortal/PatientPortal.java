package healthCarePortal;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.TestNG_listeners;
import utilities.ReadingExcel;
@Listeners (TestNG_listeners.class)
public class PatientPortal extends TestNG_listeners{
	
	//https://www.toolsqa.com/testng/testng-interview-questions/
	
	@Test
	public void Patient_Login() {
		System.out.println("Patient can login");
	}
	
	
	@Test(dataProvider="getExcelData")
	public void Patient_MakeAppt(String drName, String date, String apptTime) {
		System.out.println("Patient can make appointment");
		System.out.println("Doctor name "+drName);
		System.out.println("apointment date "+date);
		System.out.println("appointment time "+apptTime);
		
			
	}
	@BeforeMethod
	public void iteration() {
		int i=1;
		
	
		
	}
	
	@DataProvider
	public Object[][]getExcelData() throws EncryptedDocumentException, IOException{
		ReadingExcel myData=new ReadingExcel();
		return myData.readExcelData("C:\\Programming Related\\Eclipse\\eclipse"
				+ "-workspace\\seleniumTestNG\\src\\test\\resources\\TestDat"
				+ "a\\testNG.xlsx", "DEMO");
		
		
		
	}
	
	@DataProvider
	
	public Object[][] getTestData(){
		//create a 2D array if objects
		Object[][] testData=new Object[3][3];//number of rows and columns
		
		testData[0][0]= "Dr.PCP";
		testData[0][1]= "03/01/2021";
		testData[0][2]= "9:15AM";
		
		testData[1][0]= "Dr.Derma";
		testData[1][1]= "03/05/2021";
		testData[1][2]= "8:30AM";
		
		testData[2][0]= "Dr.Dent";
		testData[2][1]= "03/15/2021";
		testData[2][2]= "1:30PM";
		
		return testData;
		
	}
	
	
	
	@Test
	public void Patient_rescheduleAppt() {
		System.out.println("Patient can reschedule appointments");
	}
	
	
	
	@Test
	public void Patient_CancelAppt() {
		System.out.println("Patient can cancel appointments");
	}
	
	
	
	@Test
	public void Patient_ReadEmails() {
		System.out.println("Patient can readEmails");
	}

	@Test
	public void Patient_SendEmails() {
		System.out.println("Patient can Send Emails");
	}
	
	
	
}
