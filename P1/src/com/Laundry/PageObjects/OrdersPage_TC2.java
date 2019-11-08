package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrdersPage_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "OrdersPage" })
	public void OrdersPage2() {
		driver2=new ChromeDriver();
		
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver2);
		hp.home(ValidZipcode,hp.btnIroning);
		OrdersPage op=new OrdersPage(driver2);
		op.rightplus.click();
		op.rightplus.click();
		op.btncontinue.click();
		if(op.pricedetails.isDisplayed()==true)
		{
		System.out.println("Price details is displayed");
		}

	}}
	