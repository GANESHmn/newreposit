package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile_TC4 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void Editprofile4() {
		driver4=new ChromeDriver();	
		driver4.get(Baseurl);
		driver4.manage().window().maximize();
		LoginPage lp=new LoginPage(driver4);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver4);
		hp.eidtprofile();
		ProfilePage pp=new ProfilePage(driver4);
		pp.editphone();
		
		}
}
	