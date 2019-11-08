package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HIPAA_Page extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public HIPAA_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="agreeHIPAA_Acknowledgment_Form")
@CacheLookup
WebElement Agree_btn;

public void set_HIPAA_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.visibilityOf(Agree_btn));
	Agree_btn.click();
	
}}