//Login test with valid email only //

package com.Laundry.PageObjects;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_TC5 extends Laundry_Base_Class{
	
		@Test(groups = { "Login" })
		public void login05() 
		{
			driver5=new ChromeDriver();
			driver5.get(Baseurl);
			driver5.manage().window().maximize();
			driver5.get(Baseurl);
			driver5.manage().window().maximize();
			LoginPage lp=new LoginPage(driver5);
			lp.setemail(username);
			lp.btnclick();
			System.out.println("Test passed");
		}
		

	}

