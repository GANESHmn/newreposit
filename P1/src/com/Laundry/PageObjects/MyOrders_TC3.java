package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyOrders_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "MyOrders" })
	public void MyOrders3() {
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver3);
		hp.eidtprofile();
		ProfilePage pp=new ProfilePage(driver3);
		WebDriverWait wait=new WebDriverWait(driver3,10);
		wait.until(ExpectedConditions.visibilityOf(pp.myorders));
		pp.myorders.click();
		MyOrdersPage mp=new MyOrdersPage(driver3);
		mp.vieworder.click();
		mp.BacktoOrder();	
		
		}
}
	