package coreConcepts;

public class GmailWithMainMethod
{
	//psvm  spvm  yourclassname.main()   : GmailWithMainMethod.main()
	public  static void main(String[] abc)  // String[]  args - is to pass command line arguments
	{
		composeAndSendAnEmail();
		replyToAnEmail();
		//return 22;
	}
	public static void composeAndSendAnEmail()
	{
		System.out.println("Test Case :ComposeAndSendAnEmail ");
	}
	public static void replyToAnEmail()
	{
		System.out.println("Test Case :replyToAnEmail ");
	}
	public static void forwardAnEmail()
	{
		System.out.println("Test Case :forwardAnEmail ");
	}
	public static void deleteAnEmail()
	{
		System.out.println("Test Case :deleteAnEmail ");
	}

}
