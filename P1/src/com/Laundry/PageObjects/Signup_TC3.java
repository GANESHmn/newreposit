package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Signup_TC3 extends Laundry_Base_Class
	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			driver3=new ChromeDriver();			
			driver3.manage().window().maximize();
			driver3.get(Baseurl);
			SignupPage sp=new SignupPage(driver3);
			sp.alreadyuserlogin();
			driver3.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setemail1(Email);
			sp.btnclick();
		
			System.out.println("\n signup_TC3 \n"+sp.Name_error.getText() 
					+"\n"+ sp.Password_error.getText()
					+"\n"+ sp.Password_Confirm_error.getText()
					+"\n"+ sp.Mobile_error.getText()
					+"\n"+ sp.Terms_error.getText());
			
		}


	}
