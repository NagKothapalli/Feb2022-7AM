package heirarchialInheritance;

import org.junit.Test;

public class ComposeModule_Ram extends ReusableComponents
{
	@Test // Junit will treat this method with @Test annotation as a test method
	public void composeAndSendAnEmail() // Test Case will have test steps - Ram
	{
		System.out.println("Test Case :ComposeAndSendAnEmail ");
		// launch , login , compose , send , logout , close
		launchApplication(); // step1
		loginToApplication(); // step2
		compose(); // step3
		send(); // step4
		logoutFromApplication(); // step5
		closeApplication(); // close
	}

}
