package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
{
//Junit is a java application
	//Junit is an Unit Test Framework .
	//Junit will be used by java developers to run their unit test cases.
	@Test // Junit will treat this method with @Test annotation as a test method 
	public  void composeAndSendAnEmail()
	{
		System.out.println("Test Case :ComposeAndSendAnEmail ");
	}
	@Test
	public  void replyToAnEmail()
	{
		System.out.println("Test Case :replyToAnEmail ");
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case :forwardAnEmail ");
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case :deleteAnEmail ");
	}


}
