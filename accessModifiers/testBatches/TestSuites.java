package testBatches;

import org.junit.Test;

import testScenarios.TestCases;

//              A       extends  B        extends C   -> Multilevel Inheritance
//              A[Child]       extends  B[Immediate parent]        extends C[GrandParent]   -> Multilevel Inheritance
public class TestSuites extends TestCases//,ReusableComponents
{
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

}
