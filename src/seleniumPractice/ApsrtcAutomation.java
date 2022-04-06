package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ApsrtcAutomation 
{
	ChromeDriver driver;
	Actions actions;
	ReadProperties myprop;
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //12345678
		actions = new Actions(driver);
		driver.manage().window().maximize();
		myprop = new ReadProperties("TestData/Apsrtc.properties");
	}
	@Before
	public void launchApplication() throws IOException
	{
		//driver.get("https://www.apsrtconline.in/"); //url - TestData
		driver.get(myprop.getData("URL"));
	}
	@Test
	public void readTestData() throws IOException
	{
		FileInputStream myfile = new FileInputStream("TestData/Apsrtc.properties"); // Like a news paper
		Properties prop = new Properties(); //Like a news reader
		prop.load(myfile);
		String myurl = prop.getProperty("URL");
		String fc = prop.getProperty("FromCity");
		String tc = prop.getProperty("ToCity");
		String jd = prop.getProperty("JDate");
		System.out.println(myurl + "  -- ," + fc + "  -- ," + tc + "  -- ," + jd) ;
	}
	
	@Test
	public void bookBusTicket() throws InterruptedException, IOException
	{
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD"); // TestData getData("URL")
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(myprop.getData("FromCity"));
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(myprop.getData("ToCity")); // TestData
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//select journey date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='4']")).click();
		selectDate(myprop.getData("JDate")); //TestData
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();		
	}
	public void selectDate(String mydate)
	{
		driver.findElement(By.xpath("//a[text()='"+mydate+"']")).click(); //Dynamic xpath
	}                               //a[text()='5']
	
	@Test
	public void keyboardOperations() throws InterruptedException
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']"));
		WebElement toCity = driver.findElement(By.xpath("//input[@name='destination']"));
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").pause(1000).sendKeys(Keys.ENTER).build().perform();
		actions.moveToElement(toCity).click().sendKeys("GUNTUR").pause(1000).sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(1000);
		//actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void mouseOperations()
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(fromCity).click().sendKeys("KURNOOL").pause(1000).sendKeys(Keys.ENTER).pause(1000).doubleClick().contextClick().build().perform();
	}
	
	
	//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	@Test
	public void handleMultipleWindows() throws InterruptedException
	{		
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> mywindows = new ArrayList<String>(windows); //Set has been loaded in to ArrayList
		//read session ids 
		System.out.println("Session ID of first window :"  + mywindows.get(0));
		System.out.println("Session ID of second window :"  + mywindows.get(1));
		driver.switchTo().window(mywindows.get(1));
		Thread.sleep(2000);
		System.out.println("Title of the second winndow :" + driver.getTitle());
		driver.close(); //It will close the current active window
		//driver.quit(); // It will kill the chromedriver.exe service , All current windows will be closed
		driver.switchTo().window(mywindows.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
