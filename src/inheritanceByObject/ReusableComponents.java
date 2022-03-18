package inheritanceByObject;

public class ReusableComponents {
	// *******************Reusable Components*************************
	// Eclipse keyboard shortcuts
	// group comment : Ctrl + Shift + / , group un-comment : Ctrl + Shift + \
	// code format : Ctrl + Shift + F
	public ReusableComponents()
	{
		System.out.println("Clear the Cookies / cache");
		System.out.println("Clean the DataBase");
		System.out.println("Open an empty Google Chrome Browser");
	}
	public ReusableComponents(String browser)
	{
		System.out.println("Clear the Cookies / cache");
		System.out.println("Clean the DataBase");
		System.out.println("Open an Empty Browser :" + browser);
		//we have to write the required code to open particular browser using if else 
	}
	public ReusableComponents(String browser,int version) //Constructor overloading
	{
		System.out.println("Clear the Cookies / cache");
		System.out.println("Clean the DataBase");
		System.out.println("Open an Empty Browser :" + browser + " , Version :" + version);
		//we have to write the required code to open particular browser using if else 
	}
	protected void launchApplication() {
		System.out.println("RC : Launch Application from RC"); // ten lines of code might be required
	}

	void loginToApplication() {
		System.out.println("RC : Login to Application");
		// 10 or 15 lines of code might be required
	}

	void logoutFromApplication() {
		System.out.println("RC : Logout From Application");
		// 10 or 15 lines of code might be required
	}

	protected void closeApplication() {
		System.out.println("RC : Close Application");
	}

	void compose() {
		System.out.println("RC : Compose Mail");
	}

	public void send() {
		System.out.println("RC : Send Mail");
	}

	public void open() {
		System.out.println("RC : Open Mail");
	}

	public void reply() {
		System.out.println("RC : Reply to Mail");
	}

	public void forward() {
		System.out.println("RC : Forward Mail");
	}

	public void delete() {
		System.out.println("RC : Delete Mail");
	}

}
