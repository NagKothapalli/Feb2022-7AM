package heirarchialInheritance;

import org.junit.Test;

public class ForwardModule_Raj extends ReusableComponents
{
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

}
