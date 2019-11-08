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

public class Past_Medicat_Hist_Page extends Yosi_Base_Class {
	
	WebDriver ldriver;
	
	public Past_Medicat_Hist_Page(WebDriver rdriver)
	{
		
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

	
	
@FindBy(id="pastmedicalhistory_add")
@CacheLookup
WebElement medicalhistory_add;

@FindBy(id="pastmedicalhistory_none")
@CacheLookup
WebElement medicalhistory_none;
@FindBy(id="surgicalhistory_add")
@CacheLookup
WebElement surgicalhistory_add;

@FindBy(id="surgicalhistory_none")
@CacheLookup
WebElement surgicalhistory_none;
@FindBy(id="allergies_add")
@CacheLookup
WebElement allergies_add;
@FindBy(id="allergies_none")
@CacheLookup
WebElement allergies_none;
@FindBy(id="familyhistory_add")
@CacheLookup
WebElement familyhistory_add;
@FindBy(id="familyhistory_none")
@CacheLookup
WebElement familyhistory_none;
@FindBy(how = How.LINK_TEXT ,using = "Done")
@CacheLookup
WebElement done;
@FindBy(id="medicalinfo")
@CacheLookup
WebElement next;
@FindBy(how = How.XPATH, using = "//*[@id=\"select-surgicalhistory\"]/div/div[3]/div/label")
@CacheLookup
WebElement acid;
@FindBy(how = How.XPATH, using = "//*[@id=\"select-surgicalhistory\"]/div/div[4]/div/label")
@CacheLookup
WebElement angio;
@FindBy(how = How.XPATH, using = "//*[@id=\"surgicalhistory_dataadd\"]")
@CacheLookup
WebElement surgery_done;
@FindBy(how = How.XPATH, using = "//*[@id=\"select_allergies\"]/div/div[4]/div/label")
@CacheLookup
WebElement way;
@FindBy(how = How.XPATH, using = "//*[@id=\"select_allergies\"]/div/div[7]/div/label")
@CacheLookup
WebElement Adult;
@FindBy(how = How.XPATH, using = "//*[@id=\"allergies_dataadd\"]")
@CacheLookup
WebElement allergies_done;
@FindBy(how = How.XPATH, using = "//*[@id=\"select-familyhistory\"]/div/div[1]/div/label")
@CacheLookup
WebElement no_family_hist;
@FindBy(how = How.XPATH, using = "//*[@id=\"familyhistory_dataadd\"]")
@CacheLookup
WebElement family_done;
@FindBy(id="vaccinations_add")
@CacheLookup
WebElement vaccinations_add;
@FindBy(how = How.XPATH, using = "//*[@id=\"select_vaccinations\"]/div/div[1]/div/label")
@CacheLookup
WebElement no_vaccin;
@FindBy(how = How.XPATH, using = "//*[@id=\"vaccinations_dataadd\"]")
@CacheLookup
WebElement vaccin_done;

public void set_Medical_Hist_Page()
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(next));
	medicalhistory_add.click();
    ldriver.findElement(By.xpath("//*[@id=\"select-pastmedicalcondition1\"]/div/div[2]/div/label")).click();
	ldriver.findElement(By.xpath("//*[@id=\"select-pastmedicalcondition1\"]/div/div[6]/div/label")).click();
	done.click();
	surgicalhistory_add.click();
     wait.until(ExpectedConditions.elementToBeClickable(acid));
	acid.click();
	angio.click();
	surgery_done.click();
	allergies_add.click();
	 wait.until(ExpectedConditions.elementToBeClickable(way));
	way.click();
	Adult.click();
	allergies_done.click();
	familyhistory_add.click();
	 wait.until(ExpectedConditions.elementToBeClickable(no_family_hist));
	no_family_hist.click();
	family_done.click();

	vaccinations_add.click();
	wait.until(ExpectedConditions.elementToBeClickable(no_vaccin));
		no_vaccin.click();
		vaccin_done.click();
	next.click();
	}}