package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile_TC5 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void Editprofile5() {
		driver5=new ChromeDriver();
		driver5.get(Baseurl);
		driver5.manage().window().maximize();
		LoginPage lp=new LoginPage(driver5);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver5);
		hp.eidtprofile();
		ProfilePage pp=new ProfilePage(driver5);
		pp.myorders();
		
		
		}
}
	