package com.Yosi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurance_Information_Page extends Yosi_Base_Class{

WebDriver ldriver;
	
	public Insurance_Information_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
	@FindBy(id="primary_areyouinsured_N")
	@CacheLookup
	WebElement prime_yes;
	@FindBy(id="primary_areyouinsured_Y")
	@CacheLookup
	WebElement prime_no;
	@FindBy(id="primary_areyouinsured_noins")
	@CacheLookup
	WebElement prime_noins;
	@FindBy(id="primary_companyname")
	@CacheLookup
	WebElement insurance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"primary-insurance-algolia-hits\"]/div/div[2]/div")
	@CacheLookup
	WebElement companyname1;
	@FindBy(id="primary_policynumber")
	@CacheLookup
	WebElement policynumber1;
	@FindBy(id="primary_groupnumber")
	@CacheLookup
	WebElement groupnumber1;
	@FindBy(id="secondory_areyouinsured_N")
	@CacheLookup
	WebElement second_yes;
	@FindBy(id="secondory_areyouinsured_Y")
	@CacheLookup
	WebElement second_no;
	@FindBy(id="secondory_companyname")
	@CacheLookup
	WebElement companyname2;
	@FindBy(id="secondory_policynumber")
	@CacheLookup
	WebElement policynumber2;
	@FindBy(id="secondory_groupnumber")
	@CacheLookup
	WebElement groupnumber2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"insurace_submit\"]")
	@CacheLookup
	WebElement next;
	@FindBy(how = How.XPATH, using = "//*[@id=\"insurance-info_html\"]/div[1]/div/div/p")
	@CacheLookup
	WebElement pagetitle;

public void set_insurance_Info_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(insurance));
	insurance.sendKeys(Insurance_Company);
	pagetitle.click();
	policynumber1.clear();
	policynumber1.sendKeys(Policy_number);
	next.click();
	
	
}
}
