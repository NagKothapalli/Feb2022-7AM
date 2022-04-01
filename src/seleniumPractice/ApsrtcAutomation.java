package seleniumPractice;

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
	public ApsrtcAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //12345678
		actions = new Actions(driver);
	}
	@Before
	public void launchApplication()
	{
		driver.get("https://www.apsrtconline.in/");
	}
	@Test
	public void bookBusTicket() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).build().perform();
		//select journey date
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='4']")).click();
		selectDate("4");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
