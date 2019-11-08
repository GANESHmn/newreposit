//Forgot password with new email//
package com.Laundry.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Forgotpwd_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "ForgotPassword" })
	public void forgotpwd01() {
	
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		LoginPage lp=new LoginPage(driver1);
		lp.forgotpwd();
		lp.setemail1(Email1);
		lp.submitclk();
		
		WebDriverWait wait=new WebDriverWait(driver1,10);
		WebElement alert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.bestatlaundry-alert.alert.alert-danger.text-center.animated.fadeIn")));
		
		System.out.println(alert.getText());
		
		
		String message=alert.getText();
		if(message.contains("We can't find a user with that e-mail address."))
		{
			 Assert.assertTrue(true);
System.out.println("Test Passed");
		}
else
{
	 Assert.assertTrue(false);
System.out.println("Test failed");	

	}}}

	
	
	
	


