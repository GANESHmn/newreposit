package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Signup_TC5 extends Laundry_Base_Class
	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			
			driver5=new ChromeDriver();			
			driver5.manage().window().maximize();
			driver5.get(Baseurl);
			SignupPage sp=new SignupPage(driver5);
			sp.alreadyuserlogin();
			driver5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setpassword1(Password1);
		
			sp.btnclick();
			
			System.out.println("\n signup_TC5 \n"+sp.Name_error.getText() 
			+"\n"+ sp.Mobile_error.getText()
			+"\n"+ sp.Password_Confirm_error.getText()
			+"\n"+ sp.Email_error.getText()
			+"\n"+ sp.Terms_error.getText());
			
		}


	}
