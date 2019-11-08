package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verification_Page extends Yosi_Base_Class{
	
	WebDriver ldriver;
	
	public Verification_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(how = How.XPATH, using = "//*[@id=\"verify_date\"]")
@CacheLookup
WebElement DOB;
@FindBy(id="select_gender")
@CacheLookup
WebElement gender;
@FindBy(id="proceed_login")
@CacheLookup
WebElement verify;


public void set_Verification_Page() throws InterruptedException {
	
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(DOB));
	DOB.sendKeys(Dob);
	Select s=new Select(gender);
	s.selectByIndex(1);
	verify.click();
}
}