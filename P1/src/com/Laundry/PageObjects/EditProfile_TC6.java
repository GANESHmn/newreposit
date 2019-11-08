
package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditProfile_TC6 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void Editprofile6() {
		driver6=new ChromeDriver();
		driver6.get(Baseurl);
		driver6.manage().window().maximize();
		LoginPage lp=new LoginPage(driver6);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver6);
		hp.eidtprofile();
		ProfilePage pp=new ProfilePage(driver);
		pp.myaddressclk();
		pp.editaddressclk();
		pp.editaddress(contactname, address, City, ValidZipcode);
		pp.deleteaddress.click();
		System.out.println("Address is editable and deletable");
		}
}
	