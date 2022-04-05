package seleniumPractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusAutomation
{
	ChromeDriver driver;
	Actions actions;
	public RedBusAutomation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver(); //12345678
		actions = new Actions(driver);
		driver.manage().window().maximize();
	}
	@Before
	public void launchApplication()
	{
		driver.get("https://www.redbus.in/"); //Hard coding the values
	}
	@Test
	public void handleIframes()
	{
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		WebElement myframe = driver.findElement(By.xpath("//div[@class='modal']//iframe"));
		driver.switchTo().frame(myframe);
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9959775757");
		//driver.findElements(By.xpath("//input[@id='mobileNoInp']")).get(1).click();
		driver.switchTo().defaultContent();
		
	}
}
