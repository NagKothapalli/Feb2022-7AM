package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class GmailAutomation
{
	//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
	ChromeDriver driver ;//= new ChromeDriver(); //null
	String name; //null
	//Selenium IDE plugin added to Firefox browser . It has Record and Play back options
	//Selenium Software - WebDriver 1 .. 2  ..3 ..4 version
	//Exceptions : IllegalStateException - The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property
	//NoSuchElementException : 
	//NullPointerException
	String expectedTitle = "Gmail";
	public GmailAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //12345678
	}
	@Test
	public void launchApplication()
	{
		name = "Ram";
		System.out.println("Student Name :" + name);
		System.out.println("RC : Launch Application");
		//To launch the application in webdriver class there is a function called get("url")
		//getTitle , getUrl , windowhandle , findElement , findElements , 
		// click , clear , sendKeys ...........
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		//driver = new ChromeDriver(); //1234 //They wrote some code inside the default constructor of chromedriver
		 //class to open an empty google chrome browser window. 
		//Once the browser got opened then webdriver will interact with that browser with the help of the session ID of the window.
		driver.get("https://gmail.com");
		String sessionID = driver.getWindowHandle();
		System.out.println("My Session ID :"+ sessionID);
		String actualTitle = driver.getTitle();
		System.out.println("My Title :"+actualTitle);
		String url = driver.getCurrentUrl();
		System.out.println("My Current URL :"+ url);
		Assert.assertEquals(expectedTitle, actualTitle); //Validation
	}
	//Flow : Constructor -> Launch  -> Login
	@Test
	public void loginToApplication()
	{
		System.out.println("Student Name :" + name); //null		
		//driver.get("https://yahoo.com"); //null
		launchApplication();		
		System.out.println("RC : Login to Application");
		WebElement email = driver.findElement(By.name("identifier"));
		email.click();
		email.sendKeys("fdsgfgfdgfgfg");
		email.clear();
		email.sendKeys("nag022@gmail.com");
		email.clear();
		driver.findElement(By.id("identifierId")).sendKeys("nag022");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	@Test
	public void forgotEmail()
	{
		launchApplication();
		driver.findElement(By.tagName("button")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
