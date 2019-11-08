package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Reporting extends TestListenerAdapter {
	
	public ExtentReports extent;
	public ExtentTest logger;
	public WebDriver driver;
	
	@BeforeTest
	public void onStrart(ITestContext testContext){
		
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/BALExtentReport.html", true);
		
		extent.addSystemInfo("Host Name", "Best At Laundry");
		extent.addSystemInfo("Environment", "Automation Testing");
		extent.addSystemInfo("User Name", "Sathya S");
               
                extent.loadConfig(new File(System.getProperty("user.dir")+"\\test-output\\extent-config.xml"));
	}
	
		
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
       
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String destination = "C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\"+screenshotName+dateName+".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
      return destination;
       
    }
	 @Test
	 public void passTest(){

	 logger = extent.startTest("passTest");
	 Assert.assertTrue(true);
	 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	 }
	 
	 @Test
	 public void failTest(){
	 logger = extent.startTest("failTest");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dreamsuser\\Downloads\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "NoTitle");
		logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	 }
	 
	 @Test
	 public void skipTest(){
	 logger = extent.startTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	 }
	 
	
	 @AfterMethod
	 public void getResult(ITestResult result) throws Exception{
		 if(result.getStatus() == ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 String screenshotPath = Reporting.getScreenshot(driver, result.getName());
			//To add it in the extent report 
			logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
	
		 
		 }else if(result.getStatus() == ITestResult.SKIP){
		 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		 }

	 extent.endTest(logger);
	 }
	 @AfterTest
	 public void endReport(){
	 
	         
	                extent.close();
	 }}