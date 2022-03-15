package heirarchialInheritance;

import org.junit.Test;

public class ReplyModule_Ravi extends ReusableComponents
{
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

}
