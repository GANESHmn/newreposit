//OTP Test with 5 digit OTP//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


	public class Signup_TC12 extends Laundry_Base_Class

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
			sp.setOtp1(OldOtp);
			
			
		}}
