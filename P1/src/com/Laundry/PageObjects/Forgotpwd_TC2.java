//forgot password with existing email//
package com.Laundry.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Forgotpwd_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "ForgotPassword" })
	public void forgotpwd02() {
		driver2=new ChromeDriver();
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.forgotpwd();
		//lp.setemail1(username);
		lp.submitclk();
		
		WebDriverWait wait=new WebDriverWait(driver2,10);
		WebElement alert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.bestatlaundry-alert.alert.alert-success.text-center.animated.fadeIn > strong")));
		String message=alert.getText();
				if(message.equals("We have e-mailed your password reset link!"))
				{
					 Assert.assertTrue(true);
System.out.println("Test Passed");
				}
else
{
	 Assert.assertTrue(false);
	System.out.println("Test failed");	

	}}}

	
	
	
	


