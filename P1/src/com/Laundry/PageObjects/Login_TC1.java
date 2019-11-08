//Valid Login//
package com.Laundry.PageObjects;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Utilities.Reporting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_TC1 extends Laundry_Base_Class

{
	
	@Test
	public void login() {
		//logger = extent.startTest("passTest");
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		LoginPage lp=new LoginPage(driver1);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
        String acttitle = driver1.getTitle();

if(acttitle.equals("Best @ Laundry"))
{
	logger = extent.startTest("passTest");
	AssertJUnit.assertTrue(true);
}
else {
	logger = extent.startTest("FailTest");
	AssertJUnit.assertFalse(false);

	}}}

	
	
	
	


