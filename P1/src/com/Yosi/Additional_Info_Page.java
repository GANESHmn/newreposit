package com.Yosi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Additional_Info_Page extends Yosi_Base_Class{
WebDriver ldriver;
	
	public Additional_Info_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
	@FindBy(how = How.XPATH, using = "//*[@id=\"select_employed_wrap\"]/div[3]/label")
	@CacheLookup
	WebElement no;
	@FindBy(id="radio1")
	@CacheLookup
	WebElement yes;
	
	@FindBy(id="ssn")
	@CacheLookup
	WebElement ssn;
	@FindBy(id="select2-select_maritalstatus-container")
	@CacheLookup
	WebElement maritalstatus;
	@FindBy(id="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="select2-selection_ethnicity-container")
	@CacheLookup
	WebElement ethnicity;
	
	@FindBy(id="submit_generalinfo")
	@CacheLookup
	WebElement submit;

public void Set_Additional_info_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(submit));
no.click();
//ssn.clear();
//ssn.sendKeys(SSN);
	
	submit.click();
}
}
