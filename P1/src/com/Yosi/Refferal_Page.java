package com.Yosi;

import org.openqa.selenium.By;
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

public class Refferal_Page extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public Refferal_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="refsource")
@CacheLookup
WebElement aboutus;
@FindBy(id="reasonforvisit")
@CacheLookup
WebElement reasonforvisit;
@FindBy(how = How.XPATH, using = "//*[@id=\"viewpdfform\"]")
@CacheLookup
WebElement viewpdf;
@FindBy(id="ctlSignature")
@CacheLookup
WebElement sign;
@FindBy(how = How.XPATH, using = "//*[@id=\"profile-complete_html\"]/div[1]/div/div/p")
@CacheLookup
WebElement page_title;

@FindBy(how = How.XPATH, using = "//*[@id=\"addappointment\"]/div/div[9]/div/input")
@CacheLookup
WebElement finish;
@FindBy(how = How.XPATH, using = "//*[@id=\"yclogout\"]")
@CacheLookup
WebElement logout;
public void set_Refferal_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.visibilityOf(aboutus));
	Select s=new Select(aboutus);
	s.selectByIndex(2);
	reasonforvisit.sendKeys("Consult");
	//viewpdf.click();
	//page_title.click();
	Actions action=new Actions(driver);
	
	 action.click(sign).perform();     
	    action.clickAndHold(sign)
	    .moveByOffset(420, 280)    
	    .moveByOffset(550,300)  
	    .release().build().perform();
	   
	finish.click();
	 WebDriverWait wait1=new WebDriverWait(driver,15);
		wait1.until(ExpectedConditions.visibilityOf(logout));
	logout.click();
	
}}