//**Signup test with only Name**//

package com.Laundry.PageObjects;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



	public class Signup_TC2 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			driver2=new ChromeDriver();
			driver2.get(Baseurl);
			driver2.manage().window().maximize();
			SignupPage sp=new SignupPage(driver2);
			sp.alreadyuserlogin();
			driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setname(Name1);
			sp.btnclick();
			System.out.println("\n signup_TC2"+ sp.Email_error.getText() 
					+"\n"+ sp.Password_error.getText()
					+"\n"+ sp.Password_Confirm_error.getText()
					+"\n"+ sp.Mobile_error.getText()
					+"\n"+ sp.Terms_error.getText());
			
		}


	}
