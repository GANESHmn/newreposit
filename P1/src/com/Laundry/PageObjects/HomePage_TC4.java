//Logout test//

package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage_TC4 extends Laundry_Base_Class

{
	@Test(groups = { "HomePage" })
	public void Homepage16() {
		driver4=new ChromeDriver();
	    driver4.get(Baseurl);
	    driver4.manage().window().maximize();
		driver4.get(Baseurl);
		driver4.manage().window().maximize();
		LoginPage lp=new LoginPage(driver4);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver4);
		hp.profile.click();
		lp.logout();
		System.out.println("Successfully Logged out");
	}}