package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyOrders_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "MyOrders" })
	public void MyOrders2() {
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
		WebDriverWait wait=new WebDriverWait(driver2,10);
		wait.until(ExpectedConditions.visibilityOf(pp.myorders));
		pp.myorders();
		MyOrdersPage mp=new MyOrdersPage(driver2);
		mp.TrackOrder();
		
		
		
		}
}
	