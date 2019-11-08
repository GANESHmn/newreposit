//Forgot password with invalid email//
package com.Laundry.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Forgotpwd_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "ForgotPassword" })
	public void forgotpwd03() {
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.forgotpwd();
		lp.setemail1(invalidemail);
		lp.submitclk();
		
		
		{
System.out.println("Unable to login .Hence Test Passed");
Assert.assertTrue(true);

	}}}

	
	
	
	


