//Sigunp test with Invalid details//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Signup_TC8 extends Laundry_Base_Class

	{
		@Test(groups = { "Signup" })
		public void SignupTest() {
			
			driver8=new ChromeDriver();			
			driver8.manage().window().maximize();
			driver8.get(Baseurl);
			SignupPage sp=new SignupPage(driver8);
			sp.alreadyuserlogin();
			driver8.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			sp.createnew();
			sp.setname(Name);
			sp.setemail1(invalidemail);
			sp.setpassword1(Password1);
			sp.setconfpwd(Password1);
			sp.setmobile(Mobile);
			sp.btnclick();
			System.out.println("\n signup_TC8 \n"+sp.Email_error.getText());
		}


		
		

	}
