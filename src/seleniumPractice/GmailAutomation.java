package seleniumPractice;

import java.util.List;

import org.junit.Before;
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
	@Before
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
		//launchApplication();		
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
		//launchApplication();
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click();
		//driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Forgot')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Forgot') and @type='button']")).click();
	}
	//Xpath : 
		//fixed / Absolute / full / static 
			//  /html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span/div/div/a
		//Relative xpath
	// tagName[@attribute=value]
	// tagName[contains(@attribute,value)]
	// tagName[text()=value]
	// tagName[contains(text(),value)]
	// *[@attribute=value]
	// *[contains(@attribute,value)]
	// *[text()=value]
	// *[contains(text(),value)]
	// tagName[@attribute1=value and @attribute2=value]
	// tagName[contains(@attribute1,value) and @attribute2=value]
	// *[@attribute1=value and @attribute2=value]
	// *[contains(@attribute1,value) and @attribute2=value]
	// tagName[@attribute1=value or @attribute2=value]
	// tagName[contains(@attribute1,value) or @attribute2=value]
	// *[@attribute1=value or @attribute2=value]
	// *[contains(@attribute1,value) or @attribute2=value]
	//parent - child
	//siblings
	@Test
	public void learnMore()
	{
		//launchApplication();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.linkText("Learn more")).click();
		//driver.findElement(By.partialLinkText("Learn")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/span/div/div/a")).click();
	    //driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		//driver.findElement(By.xpath("//a[@jsname='JFyozc'  and text()='Learn more']")).click();
		driver.findElement(By.xpath("//a[@jsname='JFyozc'  or text()='Learn more']")).click();
	}
	
	@Test
	public void clickPrivacy()
	{
		//launchApplication();
		driver.findElement(By.linkText("Privacy")).click();
	}
	@Test
	public void createAccount()
	{
		//launchApplication();
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("VfPpkd-vQzf8d")); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String
		 * text = element.getText(); System.out.println("text on the object :" + text);
		 * if(text.equals("Create account")) { element.click(); break; } }
		 */
	}
	@Test
	public void clickNextBtton()
	{
		//launchApplication();
		List<WebElement> elements = driver.findElements(By.className("VfPpkd-vQzf8d"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String text = element.getText();
			System.out.println("text on the object :" + text);
			if(text.equals("Next"))
			{
				element.click();
				break;
			}
		}		
	}
	@Test
	public void clickHelp()
	{
		//launchApplication();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String text = element.getText();
			System.out.println("text on the object :" + text);
			if(text.equals("Help"))
			{
				element.click();
				break;
			}
		}		
	}
	@Test
	public void clickTerms()
	{
		//launchApplication();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(int i=0;i<elements.size();i++)
		{
			WebElement element = elements.get(i);
			String text = element.getText();
			System.out.println("text on the object :" + text);
			if(text.equals("Terms"))
			{
				element.click();
				break;
			}
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
