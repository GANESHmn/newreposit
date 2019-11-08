package com.Athena;


import java.io.IOException;

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





public class RegistrationPage extends Athena_Base_Class{

	WebDriver ldriver;
	
	public RegistrationPage(WebDriver rdriver) throws IOException
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
		}
	
	@FindBy(id="USERNAME")
	@CacheLookup
	WebElement txtusername;
	@FindBy(id="PASSWORD")
	@CacheLookup
	WebElement txtpassword;
	@FindBy(id="loginbutton")
	@CacheLookup
	WebElement loginbtn;
	@FindBy(id="DEPARTMENTID")
	@CacheLookup
	WebElement department;
	@FindBy(id="patientsmenucomponent")
	@CacheLookup
	WebElement patients;
	@FindBy(name="Calendr")
	@CacheLookup
	WebElement calendar;
	@FindBy(how = How.XPATH, using = "//*[@id=\"2cc1cab777a698baa62c605bd4fc30ec\"]")
	@CacheLookup
	WebElement NewPatientreg;
	@FindBy(name="LASTNAME")
	@CacheLookup
	WebElement txtLastname;
	@FindBy(name="FIRSTNAME")
	@CacheLookup
	WebElement txtFirstname;
	@FindBy(name="SEX")
	@CacheLookup
	WebElement drpSex;
	@FindBy(id="dob")
	@CacheLookup
	WebElement txtDob;
	@FindBy(id="rb_CONSENTTOCALLFLAG_1")
	@CacheLookup
	WebElement Consenttocall1;
	@FindBy(id="rb_CONSENTTOCALLFLAG_2")
	@CacheLookup
	WebElement Consenttocall2;
	@FindBy(name="HOMEPHONE")
	@CacheLookup
	WebElement homephone;
	@FindBy(name="MOBILEPHONE")
	@CacheLookup
	WebElement mobilephone;
	@FindBy(name="EMAIL")
	@CacheLookup
	WebElement email;
	@FindBy(name="noemail")
	@CacheLookup
	WebElement noemail;
	@FindBy(id="rb_CONSENTTOTEXTRADIO_1")
	@CacheLookup
	WebElement Consenttotext1;
	@FindBy(id="rb_CONSENTTOTEXTRADIO_2")
	@CacheLookup
	WebElement Consenttotext2;
	@FindBy(name="MARITALSTATUSID")
	@CacheLookup
	WebElement married;
	@FindBy(id="checkbox_yesno_UNCONFFAMILYSIZEDECLINEDYN")
	@CacheLookup
	WebElement familysize;
	@FindBy(id="checkbox_yesno_UNCONFIRMEDINCOMEDECLINEDYN")
	@CacheLookup
	WebElement income;
	@FindBy(id="RegistrationSaveScheduleButton")
	@CacheLookup
	WebElement saveschedule;
	@FindBy(id="RegistrationSaveInsuranceButton")
	@CacheLookup
	WebElement savesinsurance;
	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/table/tbody/tr[3]/td[1]/font/a")
	@CacheLookup
	WebElement Aetna;
	@FindBy(id="NOTICEANDSIGNATURESFLAG_CHECKBOX")
	@CacheLookup
	WebElement notice;
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginbutton\"]")
	@CacheLookup
	WebElement go;
	@FindBy(id="crToggle")
	@CacheLookup
	WebElement crtoggle;
	@FindBy(name="SUBMITVALUE")
	@CacheLookup
	WebElement Add_policy;
	@FindBy(name="IDNUMBER")
	@CacheLookup
	WebElement member_id;
	@FindBy(name="PRIMARYPROVIDERID")
	@CacheLookup
	WebElement providerid;
	@FindBy(id="ADDRESS1")
	@CacheLookup
	WebElement address;
	@FindBy(id="ZIP")
	@CacheLookup
	WebElement zipcode;
	@FindBy(id="checkbox_yesno_LANGUAGEPATIENTDECLINEDYN")
	@CacheLookup
	WebElement language;
	@FindBy(id="checkbox_yesno_RACEPATIENTDECLINEDYN")
	@CacheLookup
	WebElement race;
	@FindBy(id="checkbox_yesno_ETHNICITYPATIENTDECLINEDYN")
	@CacheLookup
	WebElement ethnicity;
	@FindBy(name="SAVE")
	@CacheLookup
	WebElement save;
	@FindBy(id="ActionMenu_Scheduling_span")
	@CacheLookup
	WebElement scheduling;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ActionMenu_Scheduling\"]/div[1]")
	@CacheLookup
	WebElement schedule_appt;
	

public void login(String env)
{
	
	if(env.equals("qa"))
	{
	txtusername.sendKeys(username);
	txtpassword.sendKeys(Password);
	loginbtn.click();
	Select s=new Select(department);
	s.selectByVisibleText("Testing Dept");
	go.click();
	}
	if(env.equals("pdev"))
	{
	txtusername.sendKeys(username);
	txtpassword.sendKeys(Password);
	loginbtn.click();
	Select s=new Select(department);
	s.selectByVisibleText("Testing Dept");
	go.click();
	}
	if(env.equals("staging"))
	{
	txtusername.sendKeys(username);
	txtpassword.sendKeys(Password);
	loginbtn.click();
	Select s=new Select(department);
	s.selectByVisibleText("CARDIOLOGY");
	go.click();
	}
}


public void register(String LastName,String FirstName,String sex,String DOB,String Phone,String Email,String mstatus) throws IOException

{    
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
	//ldriver.switchTo().frame("GlobalNav");
	   
	   Actions act=new Actions(driver);
	   patients.click();
	   driver.switchTo().defaultContent();
	act.moveToElement(NewPatientreg).click().build().perform();
	
	ldriver.switchTo().frame("GlobalWrapper");
	ldriver.switchTo().frame("frameContent");
	ldriver.switchTo().frame("frMain");
	
	txtLastname.sendKeys(LastName);
	txtFirstname.sendKeys(FirstName);
	Select s=new Select(drpSex);
	s.selectByVisibleText(sex);
	txtDob.sendKeys(DOB);
	notice.click();
	Consenttocall2.click();
	Consenttotext2.click();
	homephone.sendKeys(Phone);
	mobilephone.sendKeys(Phone);
	email.sendKeys(Email);
	Select s1=new Select(married);
	s1.selectByVisibleText(mstatus);	
	familysize.click();
	income.click();
	savesinsurance.click();
	WebDriverWait wait1=new WebDriverWait(driver,10);
	wait1.until(ExpectedConditions.visibilityOf(Aetna));
	Aetna.click();
	WebDriverWait wait2=new WebDriverWait(driver,10);
	wait2.until(ExpectedConditions.visibilityOf(member_id));
	member_id.sendKeys(Member_id);
	Add_policy.click();
	WebDriverWait wait3=new WebDriverWait(driver,10);
	wait3.until(ExpectedConditions.visibilityOf(address));
	address.sendKeys(Street_Address);
	Select s2=new Select(providerid);
	s2.selectByIndex(1);
	zipcode.sendKeys(Zipcode);
	language.click();
	race.click();
	ethnicity.click();
	save.click();
	scheduling.click();
	act.moveToElement(schedule_appt).click().build().perform();
	
	driver.switchTo().defaultContent();
}

}


