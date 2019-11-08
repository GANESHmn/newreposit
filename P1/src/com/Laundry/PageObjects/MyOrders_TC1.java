package com.Laundry.PageObjects;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyOrders_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "MyOrders" })
	public void MyOrders1() {
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		LoginPage lp=new LoginPage(driver1);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver1);
		hp.eidtprofile();
		
		ProfilePage pp=new ProfilePage(driver1);
		WebDriverWait wait=new WebDriverWait(driver1,10);
		wait.until(ExpectedConditions.visibilityOf(pp.myorders));
		pp.myorders();
		MyOrdersPage mp=new MyOrdersPage(driver1);
		mp.ViewOrder();
		
		
		
		}
}
	