package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class Signup_TC4 extends Laundry_Base_Class
	{

		@Test(groups = { "Signup" })
		public void SignupTest() {
			driver4=new ChromeDriver();			
			driver4.manage().window().maximize();
			driver4.get(Baseurl);
			SignupPage sp=new SignupPage(driver4);
			sp.alreadyuserlogin();
			driver4.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setmobile(Mobile1);
			sp.btnclick();
			
			System.out.println("\n signup_TC4 \n"+sp.Name_error.getText() 
			+"\n"+ sp.Password_error.getText()
			+"\n"+ sp.Password_Confirm_error.getText()
			+"\n"+ sp.Email_error.getText()
			+"\n"+ sp.Terms_error.getText());
			
		}


	}
