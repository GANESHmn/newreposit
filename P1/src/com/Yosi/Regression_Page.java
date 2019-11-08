package com.Yosi;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Athena.Athena_Base_Class;
import com.Athena.Read_Excel;
import com.Athena.RegistrationPage;

public class Regression_Page extends Athena_Base_Class {
	
	WebDriver ldriver;
	
	public Regression_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	@FindBy(id="USERNAME")
	@CacheLookup
	WebElement txtusername;
	@FindBy(id="PASSWORD")
	@CacheLookup
	WebElement txtpassword;
	@FindBy(id="loginbutton")
	@CacheLookup
	WebElement loginbtn;
	@FindBy(id="DEPARTMENTID")
	@CacheLookup
	WebElement department;
	@FindBy(id="patientsmenucomponent")
	@CacheLookup
	WebElement patients;
	@FindBy(id="searchinput")
	@CacheLookup
	WebElement search;
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchform\"]/div/div[2]")
	@CacheLookup
	WebElement searchenter;
	@FindBy(name="Calendar")
	@CacheLookup
	WebElement calendar;
	@FindBy(how = How.XPATH, using = "//*[@id=\"466ca95f9729ec097f14c1d00cdbcb8d\"]")
	@CacheLookup
	WebElement todays_appointments;
	@FindBy(how = How.XPATH, using = "//*[@id=\"2cc1cab777a698baa62c605bd4fc30ec\"]")
	@CacheLookup
	WebElement NewPatientreg;
	@FindBy(name="LASTNAME")
	@CacheLookup
	WebElement txtLastname;
	@FindBy(name="FIRSTNAME")
	@CacheLookup
	WebElement txtFirstname;
	@FindBy(name="SEX")
	@CacheLookup
	WebElement drpSex;
	@FindBy(id="dob")
	@CacheLookup
	WebElement txtDob;
	@FindBy(id="SSN")
	@CacheLookup
	WebElement SSN;
	@FindBy(id="SSN_link")
	@CacheLookup
	WebElement SSN_edit;
	@FindBy(name="PRIMARYPROVIDERID")
	@CacheLookup
	WebElement providerid;
	@FindBy(id="ADDRESS1")
	@CacheLookup
	WebElement address;
	@FindBy(id="ZIP")
	@CacheLookup
	WebElement zipcode;
	
	@FindBy(name="HOMEPHONE")
	@CacheLookup
	WebElement phone;
	@FindBy(id="checkinsave")
	@CacheLookup
	WebElement save;
	@FindBy(id="SUBMITVALUE")
	@CacheLookup
	WebElement checkin;
	@FindBy(id="stagespan_INTAKE")
	@CacheLookup
	WebElement intake;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-container\"]/div[4]/div[3]/div[2]/div[2]/div[2]/div/div/button[1]")
	@CacheLookup
	WebElement goto_intake;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-container\"]/div[5]/div[3]/div[1]/div/div[20]/button")
	@CacheLookup
	WebElement next;
	@FindBy(id="VITALS:HEIGHT")
	@CacheLookup
	WebElement height;
	@FindBy(id="VITALS:WEIGHT")
	@CacheLookup
	WebElement weight;
	@FindBy(how = How.LINK_TEXT, using = "Expand all")
	@CacheLookup
	WebElement expand_all;
	@FindBy(how = How.XPATH, using = "//*[@id=\"providerschedule\"]/tbody/tr[3]/td[4]/a")
	@CacheLookup
	WebElement patient_link;
	
	public void regression(String LastName,String FirstName,String sex,String DOB,String Phone,String Email,String mstatus) throws IOException
	{
		
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		//ldriver.switchTo().frame("GlobalNav");
		Actions act=new Actions(driver);
		
		
		   calendar.click();
		   driver.switchTo().defaultContent();
		act.moveToElement(todays_appointments).click().build().perform(); 
		
		
		   
		   ldriver.switchTo().frame("GlobalWrapper");
		ldriver.switchTo().frame("frameContent");
		ldriver.switchTo().frame("frScheduleNav");
		String Lastname1=LastName.toUpperCase().concat(", ");
		String Patient_name= Lastname1.concat(FirstName.substring(0, 1));
		
		if(patient_link.getText().equals(Patient_name)){
			
			patient_link.click();
		driver.switchTo().defaultContent();
		ldriver.switchTo().frame("GlobalWrapper");
		ldriver.switchTo().frame("frameContent");
		ldriver.switchTo().frame("frMain");
		
		//checkin.click();
		Select s=new Select(providerid);
		s.selectByIndex(1);
		Select s1=new Select(drpSex);
		
	
		if(txtLastname.getAttribute("value").equals(LastName.toUpperCase()))
		{
			System.out.println(txtLastname.getAttribute("value"));
		}
		else {System.out.println("Last name not updated");}
		
	if(txtFirstname.getAttribute("value").equals(FirstName.toUpperCase()))
	{
		System.out.println("Firstname updated");
	}
	else {System.out.println("First name not updated");}
	if(s1.getFirstSelectedOption().equals(sex))
	{
		System.out.println("Sex field updated");
	}
	else {System.out.println("Sex field not updated");}
	if(txtDob.getAttribute("value").equals(DOB))
	{
		System.out.println("DOB updated");
		
	}else {System.out.println("DOB not updated");}
	if(address.getAttribute("value").equals((Street_Address).toUpperCase()))
	{
		System.out.println("Address updated");
	}else {System.out.println("Address not updated");}
	if(zipcode.getAttribute("value").equals(Zipcode))
{
		System.out.println("zipcode updated");
}else {System.out.println("zipcode not updated");}
	save.click();
checkin.click();
	
	}}


	public void intake(){
		intake.click();
		goto_intake.click();
		next.click();
	
}}