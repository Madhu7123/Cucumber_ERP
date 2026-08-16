package commonFunctions;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary {
	public static WebDriver driver;
	public static Properties conpro;
	public static String Expected_Number;
	public static String Actual_Number;
	//method for launching browser
	public static WebDriver startBrowser(WebDriver driver) throws  Throwable
	{
		conpro = new Properties();
		conpro.load(new FileInputStream("./propertyfiles/Environment.properties"));
		if(conpro.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(conpro.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			try {
				throw new IllegalArgumentException("Browser value is Not Matching");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return driver;
	}
	//method for url launching
	public static void launchUrl()
	{
		driver.get(conpro.getProperty("Url"));
	}
	//method explicit
	public static void waitForElement(String LocatorType,String LocatorValue,String waitTime)
	{
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(waitTime)));
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));	
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}
	}
	//method for validate title
	public static void validateTitle(String Expected_Title)
	{
		String Actual_Title = driver.getTitle();
		try {
			Assert.assertEquals(Actual_Title, Expected_Title,"Title is Not matching");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}
	//method for textboxes
	public static void typeAction(String LocatorType,String LocatorValue,String TestData)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);
		}
	}
	//method for buttons,links,image,checkboxes and radio button
	public static void clickAction(String LocatorType,String Locatorvalue)
	{
		if(LocatorType.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(Locatorvalue)).click();
		}
		if(LocatorType.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(Locatorvalue)).click();
		}
		if(LocatorType.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(Locatorvalue)).sendKeys(Keys.ENTER);
		}
	}
	//capture supplier number
	public static void captureSupNumber(String Locatortype,String Locatorvalue)
	{
		Expected_Number = driver.findElement(By.name(Locatorvalue)).getAttribute("value");
	}
	//method to validate table
	public static void supplierTable() throws Throwable
	{
		if(!driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).isDisplayed())
			driver.findElement(By.xpath(conpro.getProperty("serachpanel"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).sendKeys(Expected_Number);
		Thread.sleep(1000);
		driver.findElement(By.xpath(conpro.getProperty("searchButton"))).click();
		Thread.sleep(3000);
		Actual_Number =driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
		Thread.sleep(2000);
		Reporter.log(Expected_Number+"    "+Actual_Number,true);
		try {
			Assert.assertEquals(Actual_Number, Expected_Number, "Supplier number Not found in table");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	//capture supplier number
		public static void captureCusNumber(String Locatortype,String Locatorvalue)
		{
			Expected_Number = driver.findElement(By.name(Locatorvalue)).getAttribute("value");
		}
		//method to validate table
		public static void customerTable() throws Throwable
		{
			if(!driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).isDisplayed())
				driver.findElement(By.xpath(conpro.getProperty("serachpanel"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).sendKeys(Expected_Number);
			Thread.sleep(1000);
			driver.findElement(By.xpath(conpro.getProperty("searchButton"))).click();
			Thread.sleep(3000);
			Actual_Number =driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span")).getText();
			Thread.sleep(2000);
			Reporter.log(Expected_Number+"    "+Actual_Number,true);
			try {
				Assert.assertEquals(Actual_Number, Expected_Number, "Supplier number Not found in table");
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		}
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	
	
}














