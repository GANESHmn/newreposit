//OTP Test with Invalid OPT//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


	public class Signup_TC9 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			
			driver9=new ChromeDriver();			
			driver9.manage().window().maximize();
			driver9.get(Baseurl);
			SignupPage sp=new SignupPage(driver9);
			sp.alreadyuserlogin();
			driver9.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setname(Name2);
			sp.setemail1(Email2);
			sp.setpassword1(Password1);
			sp.setconfpwd(Password1);
			sp.setmobile(Mobile2);
			sp.termsandcond();
			sp.btnclick();
			sp.setOtp(InvalidOtp);
			WebDriverWait wait=new WebDriverWait(driver9,5);
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println(driver9.switchTo().alert().getText());
			
		}}
