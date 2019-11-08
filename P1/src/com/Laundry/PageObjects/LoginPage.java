package com.Laundry.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Utilities.Reporting;

public class LoginPage extends Laundry_Base_Class{

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtusername;
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	@FindBy(how = How.XPATH, using = "/html/body/section/div/div/div/div/form/div/div[4]/button")
	@CacheLookup
	WebElement LoginButton;
	@FindBy(how = How.LINK_TEXT, using = "Forgot password?")
	@CacheLookup
	WebElement Forgotpwd;
	@FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
	@CacheLookup
	WebElement pwdreset;
	@FindBy(how = How.XPATH, using = "/html/body/section[2]/div/div/div[1]/div/h2")
	@CacheLookup
	WebElement loginheader;
	
	public void setemail(String email)
	{
		txtusername.sendKeys(email);
	}
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void btnclick()
	{
	LoginButton.click();
	}
	public void forgotpwd()
	{
		Forgotpwd.click();
	}
	public void setemail1(String email1)
	{
		txtusername.sendKeys(email1);
	}
	public void submitclk()
	{
		pwdreset.click();
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage lp=new LoginPage(ldriver);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
	}
	@AfterMethod
	public void logout()
	{
		HomePage hp=new HomePage(ldriver);
		hp.logout.click();
	
}}
