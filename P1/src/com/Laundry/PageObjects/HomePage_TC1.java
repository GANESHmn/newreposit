//Home Page Test1//

package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage_TC1 extends Laundry_Base_Class

{   @Parameters({"ValidZipcode","btndryclean"})
    
	@Test(priority=1)	

	public void Homepage1() {
	
	    driver1=new ChromeDriver();
	    driver1.get(Baseurl);
	    driver1.manage().window().maximize();
		HomePage hp=new HomePage(driver1);
		hp.home(ValidZipcode,hp.btndryclean);
		hp.btnwomens.click();
		OrdersPage op=new OrdersPage(driver1);
		
		if(op.Productlist.isDisplayed()==true)
		{
		System.out.println("Home page is displayed");
		}}
		
		@Parameters({"ValidZipcode","btnshirts"})
		@Test(priority=2)	
		
		public void Homepage2() {
		
			
			HomePage hp=new HomePage(driver1);
			hp.home(ValidZipcode,hp.btnshirts);
			OrdersPage op=new OrdersPage(driver1);
			hp.btnkids.click();
			if(op.Productlist.isDisplayed()==true)
			{
			System.out.println("Home page is displayed");
			}}
		
			@Parameters({"ValidZipcode","btnLaundry"})
			@Test(priority=3)	
			public void Homepage3() {
			
				
				HomePage hp=new HomePage(driver1);
				hp.home(ValidZipcode,hp.btnLaundry);
				OrdersPage op=new OrdersPage(driver1);
				hp.btnmens.click();
				if(op.Productlist.isDisplayed()==true)
				{
				System.out.println("Home page is displayed");
				}}
			@Parameters({"ValidZipcode","btnIroning"})
			@Test(priority=4)	
			public void Homepage4() {
			
				
				HomePage hp=new HomePage(driver1);
				hp.home(ValidZipcode,hp.btnIroning);
				OrdersPage op=new OrdersPage(driver1);
				hp.btnwomens.click();
				if(op.Productlist.isDisplayed()==true)
				{
				System.out.println("Home page is displayed");
				}
	}}