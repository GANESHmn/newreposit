//Check create a new account button
package com.Laundry.PageObjects;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Signup_TC1 extends Laundry_Base_Class
	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			driver1=new ChromeDriver();
			driver1.get(Baseurl);
			driver1.manage().window().maximize();
			SignupPage sp=new SignupPage(driver1);
			sp.alreadyuserlogin();
			sp.createnew();
			sp.setname(Name);
			sp.setemail1(Email);
			sp.setpassword1(Password1);
			sp.setconfpwd(Password1);
			sp.setmobile(Mobile);
			sp.termsandcond();
			sp.btnclick();
			System.out.print("\n signup_TC3"+"\n Create a new Account is successfully redirected to OTP pop up window");
	}
	}
