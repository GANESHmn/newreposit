package com.Yosi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WC_Page {

	
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

	@FindBy(id="insurance_submit")
	@CacheLookup
	WebElement submit2;


}
