package com.Athena;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Athena_Base_Class {
	Readconfig readconfig=new Readconfig();
	
	
	public String URL = readconfig.getURL();
	public String username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public String Environment = readconfig.getEnvironment();
	public String QA_cron = readconfig.getQACron();
	public String Pdev_cron = readconfig.getPdevCron();
	public String Staging_cron =readconfig.getStagingCron();
	
	public String LastName;
	public String FirstName;
	public String DOB;
	public String Phone;
	public String Email;
	public String Start_time;
	public String duration;
	public String Street_Address="Liverpool Street";
	public String Zipcode="10003";
	public String Member_id="1234";
	
	public static WebDriver driver;
	
	
		
	
	@BeforeClass
	
	
	public void setup() throws InterruptedException, AWTException, SikuliException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dreamsuser\\Downloads\\chrome\\chromedriver.exe");
		
		
ChromeOptions options = new ChromeOptions();
options.addExtensions(new File("C:\\Users\\Dreamsuser\\Downloads\\extension.crx"));
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);

driver = new ChromeDriver(capabilities);
driver.get(URL);
driver.manage().window().maximize();
String window1=driver.getWindowHandle();
WebDriverWait wait=new WebDriverWait(driver,10);
wait.until(ExpectedConditions.numberOfWindowsToBe(2));
String window2=driver.getWindowHandle();

driver.switchTo().window(window1);

Pattern img1=new Pattern("C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\Screenshot\\img1.png");
Pattern img2=new Pattern("C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\Screenshot\\img2.png");
Pattern img3=new Pattern("C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\Screenshot\\img3.png");
Pattern img4=new Pattern("C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\Screenshot\\img4.png");
Pattern img5=new Pattern("C:\\Users\\Dreamsuser\\Sathya\\P1\\test-output\\Screenshot\\img5.png");
Screen s=new Screen();

s.hover(img1);
s.click(img1);
s.hover(img2);
s.click(img2);
s.hover(img3);
s.click(img3);
s.hover(img4);
s.click(img4);
s.hover(img5);
s.click(img5);
RegistrationPage rp=new RegistrationPage(driver);
rp.login(Environment);
}
	
	@AfterMethod
	public void screenshot() throws IOException
	
	{
		AppointmentPage ap=new AppointmentPage(driver);
		ap.screenshot();
	}
	
	@AfterClass
	public void teardown() throws IOException
	{
		AppointmentPage ap=new AppointmentPage(driver);
		ap.cron(Environment);
	}}
		//driver.quit();
		
	
