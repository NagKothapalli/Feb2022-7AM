package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation
{
	//Selenium IDE plugin added to Firefox browser . It has Record and Play back options
	//Selenium Software - WebDriver 1 .. 2  ..3 ..4 version
	@Test
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//To launch the application in webdriver class there is a function called get("url")
		//getTitle , getUrl , windowhandle , findElement , findElements , 
		// click , clear , sendKeys ...........
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //They wrote some code inside the default constructor of chromedriver
		 //class to open an empty google chrome browser window. 
		//Once the browser got opened then webdriver will interact with that browser with the help of the session ID of the window.
		driver.get("https://gmail.com");
	}

}
