package testScenarios;

import org.junit.Test;

import rComponents.ReusableComponents;

//            Child              Parent
public class TestCases extends ReusableComponents {

	// 0 0 - Error msg , 0 1 - from parent  , 1 0 - from child , 1 1 - from child
	
	/*
	 * public void launchApplication() {
	 * System.out.println("RC : Launch Application from TestCases"); }
	 */
	 

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

	@Test
	public void replyToAnEmail() // Ravi
	{
		System.out.println("Test Case :replyToAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();

	}

	@Test
	public void forwardAnEmail() // Raj
	{
		System.out.println("Test Case :forwardAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}

	@Test
	public void deleteAnEmail() // Rajesh
	{
		System.out.println("Test Case :deleteAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
