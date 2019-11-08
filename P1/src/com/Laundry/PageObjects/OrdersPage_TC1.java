package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrdersPage_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "OrdersPage" })
	public void OrdersPage1() {
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		LoginPage lp=new LoginPage(driver1);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver1);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver1);
		
		if(op.Productlist.isDisplayed()==true)
		{
		System.out.println("Orders page is displayed");
		}
		
		if(op.Subcategorylist.isDisplayed()==true)
		{
		System.out.println("Subcategories are displayed");
		}
		if(op.leftminus.isDisplayed()==true)
		{
		System.out.println("Quantity increase option is displayed");
		}
		if(op.rightplus.isDisplayed()==true)
		{
		System.out.println("Quantity decrease option is displayed");
	}}}