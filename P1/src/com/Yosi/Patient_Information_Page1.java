package com.Yosi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Patient_Information_Page1 extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public Patient_Information_Page1(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	@FindBy(how = How.CLASS_NAME, using = "btn btn-block start_reg_btn")
	@CacheLookup
	WebElement registration;
	
@FindBy(id="employeename")
@CacheLookup
WebElement employeename;

@FindBy(id="mobilenumber")
@CacheLookup
WebElement mobile;

@FindBy(id="address")
@CacheLookup
WebElement address;

@FindBy(id="zipcode")
@CacheLookup
WebElement zipcode;

@FindBy(id="wc_zipcode")
@CacheLookup
WebElement wc_zipcode;

@FindBy(id="date")
@CacheLookup
WebElement dob;


@FindBy(id="wc_address")
@CacheLookup
WebElement wc_address;

@FindBy(id="wc_phone")
@CacheLookup
WebElement wc_mobile;
@FindBy(id="wc_cliam")
@CacheLookup
WebElement wc_claim;



@FindBy(id="satecity_area")
@CacheLookup
WebElement city;

@FindBy(id="wc_satecity_area")
@CacheLookup
WebElement wc_city;

@FindBy(id="date")
@CacheLookup
WebElement date;

@FindBy(id="radio11")
@CacheLookup
WebElement radio11;

@FindBy(id="radio12")
@CacheLookup
WebElement radio12;
@FindBy(name="employer_submit")
@CacheLookup
WebElement submit;


public void Set_Patient_Info_Page()
{
	
}
}
