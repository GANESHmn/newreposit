package com.Yosi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Patient_LifeStyle_Page extends Yosi_Base_Class{
	
	WebDriver ldriver;
	
	public Patient_LifeStyle_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="select_smoking")
@CacheLookup
WebElement smoking;

@FindBy(id="select_drink")
@CacheLookup
WebElement drinks;
@FindBy(id="select_drugs")
@CacheLookup
WebElement drugs;
@FindBy(id="lifestyleinfo")
@CacheLookup
WebElement next;


public void Set_Lifestyle_page()
{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(smoking));
	Select s=new Select(smoking);
	s.selectByIndex(1);
	Select s1=new Select(drinks);
	s1.selectByIndex(1);
	Select s2=new Select(drugs);
	s2.selectByIndex(1);
	next.click();
	
	
}}