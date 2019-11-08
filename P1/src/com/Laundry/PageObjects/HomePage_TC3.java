//Home Page test without zipcode//

package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "HomePage" })
	public void Homepage3() {
		driver3=new ChromeDriver();
	    driver3.get(Baseurl);
	    driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver3);
		hp.btndryclean.click();
		String alertmessage=hp.alertmsg.getText();
		System.out.println(alertmessage);
	}}