package healthCarePortal;

import org.testng.annotations.Test;

public class ResearchEngine {

	@Test(groups="login")
	public void Research_Login() {
		System.out.println("Research can login");
	}
	
	@Test
	public void Research_SearchTopic() {
		System.out.println("Patient can search topics");
	}
	
	
	@Test
	public void Research_BrowseTopics() {
		System.out.println("Patient can browser diffrent topics");
	}
	
	
	@Test
	public void Research_UploadFindings() {
		System.out.println("Patient can upload findings");
	}
	
}
