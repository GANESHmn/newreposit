	package com.Yosi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Patient_RX_Info_Page extends Yosi_Base_Class{
	
	WebDriver ldriver;
	
	public Patient_RX_Info_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="pharmacysearch")
@CacheLookup
WebElement pharmacysearch;

@FindBy(id="pharmacyzipcode")
@CacheLookup
WebElement zipcode;
@FindBy(id="select_medication1")
@CacheLookup
WebElement medication;
@FindBy(id="select_medication_dosage1")
@CacheLookup
WebElement dosage;
@FindBy(id="select_medication_frequency1")
@CacheLookup
WebElement frequency;
@FindBy(how = How.XPATH, using = "//*[@id=\"add_medi_data\"]")
@CacheLookup
WebElement add_medication;
@FindBy(id="medicationinfo")
@CacheLookup
WebElement next;
@FindBy(how = How.XPATH, using = "//*[@id=\"pharmacysearch_wrap\"]/div[4]/div[1]/span[1]")
@CacheLookup
WebElement pharmacy_name;
@FindBy(how = How.XPATH, using = "//*[@id=\"medication-hits\"]/div/div[4]/div/p")
@CacheLookup
WebElement medication_name;

public void Set_RX_info_Page() throws InterruptedException
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(next));
	pharmacysearch.sendKeys("test");
	
	wait.until(ExpectedConditions.visibilityOf(pharmacy_name));
	pharmacysearch.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	zipcode.sendKeys("10003");
	medication.click();
	
wait.until(ExpectedConditions.visibilityOf(medication_name));
medication_name.click();
add_medication.click();
	
	next.click();
}
}

