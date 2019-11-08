//OTP Test without entering OTP//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


	public class Signup_TC11 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			
			driver.get("http://api.bestatlaundry.com/");
			driver.manage().window().maximize();
			SignupPage sp=new SignupPage(driver);
			sp.ordernow();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setname(Name2);
			sp.setemail1(Email2);
			sp.setpassword1(Password1);
			sp.setconfpwd(Password1);
			sp.setmobile(Mobile2);
			sp.termsandcond();
			sp.btnclick();
			WebDriverWait wait=new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.visibilityOf(sp.Verifybtn));
			sp.Verifybtn.click();
		
			
		}}
