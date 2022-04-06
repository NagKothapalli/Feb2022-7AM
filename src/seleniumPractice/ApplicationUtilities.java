package seleniumPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ApplicationUtilities
{
	//takescreenshot , Actions click , doubleclick , rightclick 
	WebDriver driver;
	Actions actions;
	public ApplicationUtilities(WebDriver driver)
	{
		this.driver = driver;
		actions = new Actions(driver);
	}
	
	public void hardClick(WebElement element)
	{
		actions.moveToElement(element).click().build().perform();
	}
	public void rightClick(WebElement element)
	{
		actions.moveToElement(element).contextClick().build().perform();
	}
	public void doubleClick(WebElement element)
	{
		actions.moveToElement(element).doubleClick().build().perform();
	}
	
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}


}
