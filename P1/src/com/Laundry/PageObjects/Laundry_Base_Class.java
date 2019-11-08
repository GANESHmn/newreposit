package com.Laundry.PageObjects;

import java.io.File;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import Utilities.Reporting;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Laundry_Base_Class {
	
	//Credentials
	public String Baseurl = "http://api.bestatlaundry.com/login";
	public String username = "Testingteam@dreams.com";
	public String Password = "Test@123";
	
	//Sign up
	public String Name = "John";
	public String Email="John@yopmail.com";
	public String Password1="Mithran@11";	
	public String Mobile="7338378505";	
		
	public String Name1 = "John";
	public String Name2="Pavithra";
	public String Email1="Peter@yopmail.com";
	public String Email2="Pavithra@yopmail.com";
	
	public String Mobile1="74186122896";
	public String Mobile2="07904760587";
	public String invalidemail="Lisayopmail";
	public String invalidpwd="123";
	public String uname1="^79HgFgh";
	public String contactname="contactname";
	public String address="address street";
	public String City="City";
	
	//landing page
	public String ValidZipcode="GU33PA";
	public String invalidZipcode="Yu038";
	
	//Add new Address
	public String address1="Address line1";
	public String address2="Address line2"; 
	public String location="Location";
	public String city="City";
	//Card Details
	public String Cardnumber="5555 5555 5555 4444";
	public String Invalidcardnumber ="5555 5555 5555 1234";
	public String Cardexpiry="12/22";
	public String cvc="123";
	
	//OTP
	public String[] OldOtp= new String[] {"1","4","9","7","6","0"};
	public String[] InvalidOtp= new String[] {"1","2","3","4","5","6"};
	
	//ChromeDriver
	public static WebDriver driver;
	public static WebDriver driver1;
	public static WebDriver driver2;
	public static WebDriver driver3;
	public static WebDriver driver4;
	public static WebDriver driver5;
	public static WebDriver driver6;
	public static WebDriver driver7;
	public static WebDriver driver8;
	public static WebDriver driver9;
	
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeClass
	public void setup() throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dreamsuser\\Downloads\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganesh moorthi.n\\Downloads\\chrome\\chromedriver.exe");
		}
		
//	@AfterClass
public void teardown()
{
	driver.quit();
	}}

