package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Emergency_Contact_Page extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public Emergency_Contact_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="pcp")
@CacheLookup
WebElement pcpname;

@FindBy(id="pcpcontactnumber")
@CacheLookup
WebElement pcpcontactnumber;
@FindBy(id="emc_firstname")
@CacheLookup
WebElement emc_firstname;
@FindBy(id="emc_lastname")
@CacheLookup
WebElement emc_lastname;
@FindBy(id="select_emc_relationship")
@CacheLookup
WebElement emc_relationship;
@FindBy(id="emc_number")
@CacheLookup
WebElement emc_number;
@FindBy(id="pcpinfo")
@CacheLookup
WebElement next;
@FindBy(how = How.XPATH, using = "//*[@id=\"pcp_wrap\"]/div[3]/div[1]")
@CacheLookup
WebElement pcp_name;


@FindBy(how = How.XPATH, using = "//*[@id=\"pcp-info_html\"]/div[1]/div/div/p")
@CacheLookup
WebElement page_title;


public void set_Emergency_Contact_Page() throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(page_title));
	pcpname.sendKeys("test");
wait.until(ExpectedConditions.visibilityOf(pcp_name));
	pcpname.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	pcpname.sendKeys(Pcpname);
pcpcontactnumber.sendKeys(mobile);
	emc_firstname.clear();
	emc_firstname.sendKeys(EFirstname);
	emc_lastname.clear();
	emc_lastname.sendKeys(Elastname);
	Select s=new Select(emc_relationship);
	s.selectByIndex(2);
	emc_number.sendKeys("(503)-400-8765");
	next.click();
	
	
}}