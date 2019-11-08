package com.Laundry.PageObjects;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void Editprofile1() {
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		LoginPage lp=new LoginPage(driver1);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver1);
		hp.eidtprofile();
		
		}
}
	