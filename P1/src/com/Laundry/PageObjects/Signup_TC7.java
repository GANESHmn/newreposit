//Signup Test with Empty fields//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Signup_TC7 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			driver7=new ChromeDriver();			
			driver7.manage().window().maximize();
			driver7.get(Baseurl);
			SignupPage sp=new SignupPage(driver7);
			sp.alreadyuserlogin();
			driver7.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			
		
			sp.btnclick();
			
			System.out.println("\n signup_TC7 \n"+sp.Name_error.getText()
			+"\n"+ sp.Email_error.getText() 
			+"\n"+ sp.Password_error.getText()
			+"\n"+ sp.Password_Confirm_error.getText()
			+"\n"+ sp.Mobile_error.getText()
			+"\n"+ sp.Terms_error.getText());
			
		}


	}
