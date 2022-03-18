package inheritanceByObject;

import org.junit.Test;

//            Child              Parent
public class TestCases //extends ReusableComponents
{
	//Modifier[opt]   ClassName    objName  = new Constructor();
	//public ReusableComponents rc = new ReusableComponents();
	public ReusableComponents rc = new ReusableComponents("ie");
	//public ReusableComponents rc = new ReusableComponents("chrome",95);
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
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

	@Test
	public void replyToAnEmail() // Ravi
	{
		System.out.println("Test Case :replyToAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();

	}

	@Test
	public void forwardAnEmail() // Raj
	{
		System.out.println("Test Case :forwardAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

	@Test
	public void deleteAnEmail() // Rajesh
	{
		System.out.println("Test Case :deleteAnEmail ");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
