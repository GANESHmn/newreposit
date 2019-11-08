//Order test1//
package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrdersPage_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "OrdersPage" })
	public void OrdersPage3() {
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver3);
		hp.home(ValidZipcode,hp.btnshirts);
		OrdersPage op=new OrdersPage(driver3);
		for(int i=1;i<4;i++)
		{
			op.rightplus.click();
		}
		op.btncontinue.click();
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver3);
		if(ap.addressbox.isDisplayed()==true)
		{
			System.out.println("Address page displayed");
		}
		else
		{
			System.out.println("Address page is not displayed");
		}			
	}}
	