package coreConcepts;

public class AccessModiferDemo  //package : coreConcepts
{
	public static String topicName = "Selenium";
	
	public void teacher()
	{
		System.out.println("Explain the topic :" + topicName);
	}
}


class Child  //package : coreConcepts
{
	public void student()
	{
		System.out.println("Read the topic :" + AccessModiferDemo.topicName);
	}
}
