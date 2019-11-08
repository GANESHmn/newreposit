package com.Athena;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class AppointmentPage extends Athena_Base_Class{

	WebDriver ldriver;
	
	public AppointmentPage(WebDriver rdriver) throws IOException
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"d_2019_08_02\"]")
	@CacheLookup
	WebElement date;
	@FindBy(how = How.XPATH, using = "//*[@id=\"staffusernameinput\"]/select")
	@CacheLookup
	WebElement provider1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"appointmenttypes\"]/select")
	@CacheLookup
	WebElement apptmt_type;
	@FindBy(how = How.XPATH, using = "//*[@id=\"findapptslotscontainer\"]/div[1]/span/span[1]/a")
	@CacheLookup
	WebElement slot;
	@FindBy(name="STARTTIME")
	@CacheLookup
	WebElement start_time;
	@FindBy(name="DURATION")
	@CacheLookup
	WebElement Duration;
	
	@FindBy(id="ADDAPPOINTMENT")
	@CacheLookup
	WebElement add_apptmt;
	@FindBy(how = How.XPATH, using = "//*[@class=\"heading c__page-header\"]")
	@CacheLookup
	WebElement apptmt_created;
	@FindBy(how = How.XPATH, using = "//*[@id=\"patientworkflowheading\"]/div/ul[1]/li[3]")
	@CacheLookup
	WebElement appt_id;
	@FindBy(id="logout")
	@CacheLookup
	WebElement logout;

public void appointment(String provider,String strt_time,String duration,String appt) throws InterruptedException, IOException
{
	ldriver.switchTo().defaultContent();
	ldriver.switchTo().frame("GlobalWrapper");
	ldriver.switchTo().frame("frameContent");
	ldriver.switchTo().frame("frMain");
	ldriver.switchTo().frame("frFindCalendar");
	date.click();
	ldriver.switchTo().defaultContent();
	ldriver.switchTo().frame("GlobalWrapper");
	ldriver.switchTo().frame("frameContent");
	ldriver.switchTo().frame("frMain");
	ldriver.switchTo().frame("frFindMain"); 
	slot.click();
	ldriver.switchTo().defaultContent();
	ldriver.switchTo().frame("GlobalWrapper");
	ldriver.switchTo().frame("frameContent");
	ldriver.switchTo().frame("frMain");
	ldriver.switchTo().frame("frFindMain");
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(provider1));
	
	Select s=new Select(apptmt_type);
	s.selectByVisibleText(appt);
    Select s1=new Select(provider1);
	s1.selectByVisibleText(provider);
    
	start_time.sendKeys(strt_time);
	Duration.sendKeys(duration);
	
	
	add_apptmt.click();
	
    try
    {
	driver.switchTo().alert().accept();
    }catch(NoAlertPresentException e)
    {
    	e.getMessage();
    }
    
	
	//driver.switchTo().defaultContent();
	
}
public void screenshot() throws IOException
{
	WebDriverWait wait2=new WebDriverWait(driver,10);
	wait2.until(ExpectedConditions.visibilityOf(apptmt_created));
	//String Appt_id=appt_id.getText().substring(1, 5);
	TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    
    String destination = "C:\\Users\\Dreamsuser\\Sathya\\P1\\Appointment_details.png";
    File finalDestination = new File(destination);
    FileUtils.copyFile(source, finalDestination);
}

public void cron(String env) throws IOException
{
	
	if(env.equals("qa"))
	{
	ldriver.navigate().to(QA_cron);
	}
	if(env.equals("pdev"))
	{
		ldriver.navigate().to(Pdev_cron);
		screenshot();
	}
	if(env.equals("staging"))
	{
		ldriver.get(Staging_cron);
		screenshot();
	}}}