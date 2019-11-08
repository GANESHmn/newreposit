package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Yosi_Base_Class {
	
	public static WebDriver driver;
	
	public String Baseurl = "https://staging.yosicare.com/dashboard/email_callback?action=confirmed&invite_id=abd936e8a75143b8bb927d7d826d6bbca438ad95&source=Email";
	public String Dob="06/01/1987";
	public String Street_Address="Liverpool Street";
	public String Zipcode="10003";
	public String mobile="(503) 400-8773";
	public String Lastname="Test";
	public String Firstname="Martin";
	
	public String Insurance_Company="AETNA";
	public String Policy_number="512358";
	public String SSN="111111111";
	public String Pcpname="MHIN - DIRECT TESTING";
	public String EFirstname="Peter";
	public String Elastname="Test";
	public String Appt_id="15968";
	public String Environment="staging";
	
	
@BeforeClass
public void setup() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dreamsuser\\Downloads\\chrome\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(Baseurl);
	
	driver.manage().window().maximize();
	
	WebElement Startpaperwork= driver.findElement(By.xpath("/html/body/div/div[5]/a"));
	Startpaperwork.click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"clkadult\"]/div/div/a")).click();
	
}


//@AfterClass
public void teardown()
{
driver.quit();
}}
