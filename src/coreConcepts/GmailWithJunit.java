package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
//JUNIT is a java application
	//Junit is a Unit Test Framework .
	//Junit will be used by java developers to run their unit test cases.
	@Test // Junit will treat this method with @Test annotation as a test method 
	public  void composeAndSendAnEmail() // Test Case will have test steps  - Ram
	{
		System.out.println("Test Case :ComposeAndSendAnEmail ");
		//launch , login , compose , send , logout , close
		launchApplication(); // step1
		loginToApplication(); //step2
		compose(); //step3
		send(); //step4
		logoutFromApplication(); //step5
		closeApplication(); //close
	}
	@Test
	public  void replyToAnEmail()  //Ravi
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
	public  void forwardAnEmail() //Raj
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
	public  void deleteAnEmail() //Rajesh
	{
		System.out.println("Test Case :deleteAnEmail ");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	
	//*******************Reusable Components*************************
	
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//ten lines of code might be required
	}
	protected void loginToApplication()
	{
		System.out.println("RC : Login to Application");
		//10 or 15 lines of code might be required
	}
	private void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
		//10 or 15 lines of code might be required
	}
	void closeApplication()
	{
		System.out.println("RC : Close Application");
	}
	public void compose()
	{
		System.out.println("RC : Compose Mail");
	}
	public void send()
	{
		System.out.println("RC : Send Mail");
	}
	public void open()
	{
		System.out.println("RC : Open Mail");
	}
	public void reply()
	{
		System.out.println("RC : Reply to Mail");
	}
	public void forward()
	{
		System.out.println("RC : Forward Mail");
	}
	public void delete()
	{
		System.out.println("RC : Delete Mail");
	}

}
