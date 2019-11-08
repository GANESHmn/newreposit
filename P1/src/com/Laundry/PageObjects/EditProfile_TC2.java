package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void Editprofile2() {
		driver2=new ChromeDriver();		
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver2);
		hp.eidtprofile();
		ProfilePage pp=new ProfilePage(driver2);
		pp.editname(uname1);
		System.out.println("Name field is accepting special characters and numbers");
		}
}
	