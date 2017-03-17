package testScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;*/
import org.openqa.selenium.support.ui.Select;
/*import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty7.util.log.Log;*/
import org.testng.Assert;
/*import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
*/
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


//import com.thoughtworks.selenium.Wait;

public class Keyword {
	
	//public static Logger log;
	public WebDriver driver;
	
	public static Logger log;
	ExtentReports report;
	ExtentTest logger; 
	
	
	static Properties prop;
	static FileInputStream input;
	 String randomName = "";
	 public static String stores12;
	 public static String stores123;
	 
	 public void logger(String testData){
		 report=new ExtentReports("C:\\Users\\Prajakta\\workspace\\SageSurferDataDrivenFramework\\loggerreport.html");
		 
		logger=report.startTest("VerifyBlogIsWorkingProperly");
		logger.log(LogStatus.INFO, testData);
	 }
	public void openbrowser() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		prop = new Properties();
		input =	new FileInputStream("C://Users//Prajakta//workspace//SageSurferDataDrivenFramework//object.properties");
		prop.load(input);
		
	}
	 public String generateRandomNumber(int length){
		  return RandomStringUtils.randomNumeric(length);
		 }
	
	public void input(String testData, String objectName) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).clear();
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
	}
	public void RandomString() { 
	    Random r = new Random();
	    String alphabet = "AbcdCfghiJklMnopQrstuvwxyz";
	    final int N = 10;
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i <= N; i++) {
	     sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
	    }
	    randomName = sb.toString();
	    System.out.println(randomName);
	   }
	
	public void navigate(String testData) throws InterruptedException {
		Thread.sleep(4000);
		driver.get(testData);
		
	}
	public void click(String objectName) throws InterruptedException  {
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}
	public void clickMenubtnopen(String objectName) throws InterruptedException  {
		Thread.sleep(10000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).click();
		
	}
	public void DatePicker(String testData) throws InterruptedException  {
		Thread.sleep(2000);
		driver.findElement(By.xpath(testData)).click();
		List<WebElement> alldate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		 for(WebElement e: alldate){
			 
			 String date = e.getText();
			  if(date.equalsIgnoreCase("10")){
				  
				  e.click();
				break;
				  
			  }
		 }
		
	}
	public void click1(String objectName) throws InterruptedException  {
		RandomString();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).clear();
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(randomName);
		stores12=(driver.findElement(By.xpath(prop.getProperty(objectName))).getText());
		stores123=(driver.findElement(By.xpath(prop.getProperty(objectName))).getText());
	}
	
	public void numbers(String objectName,String testData) throws InterruptedException  {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(testData);
		
	}
	public void randomEmails(String objectName) throws InterruptedException  {
		RandomString();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).clear();
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(randomName+"@gmail.com");
		stores12=(driver.findElement(By.xpath(prop.getProperty(objectName))).getText());
		stores123=(driver.findElement(By.xpath(prop.getProperty(objectName))).getText());
	}
	public void inputjavaScript() throws InterruptedException  {
		Thread.sleep(4000);
    	((JavascriptExecutor)driver).executeScript("tinymce.activeEditor.setContent('testing');");
	}
	public void webelement(String objectName,double testData) throws InterruptedException  {
		Thread.sleep(4000);
		 List <WebElement> allbtn=driver.findElements(By.xpath(objectName));
		  {
			  allbtn.get((int) testData).click();
			  
		  }
    	
	}
	public void scrolldown(String testData) throws InterruptedException  {
		Thread.sleep(5000);
    	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript(testData, "");
	   //Thread.sleep(7000);
	}
	public void scroll() throws InterruptedException  {
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy(0,-350)", "");
		   Thread.sleep(3000);
		
	}
	public void generateNumber(String objectName, double testData) throws InterruptedException  {
		RandomString();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty(objectName))).clear();
		driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(generateRandomNumber((int) testData));
		stores12=(driver.findElement(By.xpath(prop.getProperty(objectName))).getText());
		
	}
	public void myframe() throws InterruptedException  {
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='myFrame']")));
			
	}
	public void assertc(String testData) throws InterruptedException  {
		Thread.sleep(2000);
		
		 String Actualtext11=driver.getPageSource();
		   Assert.assertTrue(Actualtext11.contains(testData));
}
	public void assertm(String testData) throws InterruptedException  
	{
		Thread.sleep(2000);
		
		 String Actualtext11=driver.getPageSource();
		   Assert.assertTrue(Actualtext11.contains(stores12));
}
	public void assertfalse() throws InterruptedException  
	{
		Thread.sleep(2000);
		
		 String Actualtext11=driver.getPageSource();
		   Assert.assertFalse(Actualtext11.contains(stores123));
}
	public void autoitSelectImage() throws InterruptedException, IOException  {
		Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath(".//*[@id='plupload-browse-button']"));
			element.click();
			Thread.sleep(3000);
	             //Which calls the autoit exe file
			Runtime.getRuntime().exec("E:\\uploadfile.exe");
			Thread.sleep(5000);
}
	public void screenshot(String testData) throws InterruptedException, IOException  {
		Thread.sleep(2000);
		File scrFile11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile11, new File("E://Prajakta//E driver full Project folder//Project//NdesignSageSurf//Ndesign's screenshots//"+testData+".png"));
	   
	}
	public void selectDropdown(String objectName,double testData) throws InterruptedException, IOException  {
		 Thread.sleep(5000);
		  Select s=new Select(driver.findElement(By.xpath(prop.getProperty(objectName))));
		  s.selectByIndex((int) testData);
	  
	}
	public void Thread(double testData) throws InterruptedException, IOException  {
		  Thread.sleep((int) testData);
	}
	

	 public void shutdown() throws IOException
	        { 
		
		 	   driver.close();
		 	  
		 	   
		 	   } 
	public String verifypagetext(String expectedTestData, String objectName) {
	
		String actualValue = driver.findElement(By.xpath(prop.getProperty(objectName))).getText();
		return actualValue;
	}
	public String verifypagetitle(String expectedTestData) {
		String actualValue  = driver.getTitle();
		return actualValue;
	}
	public void refresh() throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	public void switchToAnotherTab() throws InterruptedException {
		Thread.sleep(2000);
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	      driver.switchTo().window(tabs2.get(1));
	}
	
	public void switchToSecondtab() throws InterruptedException {
		Thread.sleep(2000);
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	      driver.switchTo().window(tabs2.get(2));
	}
	
	public void switchToPreviousTab() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	      driver.switchTo().window(tabs2.get(0));
	}
	public void actionElements(String testData) throws InterruptedException {
	 Thread.sleep(5000);
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath(testData))).click();
	  act.sendKeys("manual");
	  act.sendKeys(Keys.DOWN);
	  act.sendKeys(Keys.RETURN);
	  act.build().perform();
	}
	public void actionElementstestData(String testData,String objectName) throws InterruptedException {
		 Thread.sleep(5000);
		  Actions act=new Actions(driver);
		  act.moveToElement(driver.findElement(By.xpath(objectName))).click();
		  act.sendKeys(testData);
		  act.sendKeys(Keys.DOWN);
		  act.sendKeys(Keys.RETURN);
		  act.build().perform();
		}

	
}
