

package com.Yosi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Financial_Responsibility_Page extends Yosi_Base_Class{

	WebDriver ldriver;
	
	public Financial_Responsibility_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(id="patientsame_access")
@CacheLookup
WebElement patient_yes;

@FindBy(id="patientsame_access1")
@CacheLookup
WebElement patient_no;
@FindBy(id="firstname")
@CacheLookup
WebElement firstname;
@FindBy(id="lastname")
@CacheLookup
WebElement lastname;
@FindBy(id="select_gender_option1")
@CacheLookup
WebElement male;
@FindBy(id="select_gender_option2")
@CacheLookup
WebElement female;
@FindBy(id="date")
@CacheLookup
WebElement dob;
@FindBy(id="select2-selection_emc_relationshio-container")
@CacheLookup
WebElement relationship;
@FindBy(id="mobilenumber_work")
@CacheLookup
WebElement work_mobile;
@FindBy(id="mobilenumber_home")
@CacheLookup
WebElement home_mobile;

@FindBy(id="select_my_insurance1")
@CacheLookup
WebElement insurance_yes;
@FindBy(id="select_my_insurance2")
@CacheLookup
WebElement insurance_no;
@FindBy(id="addresssame_access")
@CacheLookup
WebElement addresssame;
@FindBy(id="address1")
@CacheLookup
WebElement address1;
@FindBy(id="address2")
@CacheLookup
WebElement address2;
@FindBy(id="zipcode")
@CacheLookup
WebElement zipcode;
@FindBy(id="select2-select_statecity-container")
@CacheLookup
WebElement CityState;
@FindBy(id="guarantorsubmitpinfo")
@CacheLookup
WebElement next;

public void set_Financial_Responsibility_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(home_mobile));
	lastname.clear();
	lastname.sendKeys(Lastname);
	//work_mobile.sendKeys(mobile);
	//home_mobile.sendKeys(mobile);
	next.click();
}

}