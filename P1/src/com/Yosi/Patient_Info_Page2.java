package com.Yosi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Patient_Info_Page2 extends Yosi_Base_Class{
	
	WebDriver ldriver;
	
	public Patient_Info_Page2(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	@FindBy(how = How.CLASS_NAME, using = "btn btn-block start_reg_btn")
	@CacheLookup
	WebElement registration;
	
@FindBy(id="address1")
@CacheLookup
WebElement address;

@FindBy(id="zipcode")
@CacheLookup
WebElement zipcode;
@FindBy(name="submitpinfo")
@CacheLookup
WebElement next;
public void Set_Patient_Info_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(next));
	address.clear();
	address.sendKeys(Street_Address);
	zipcode.sendKeys(Zipcode);
	next.click();
}
}