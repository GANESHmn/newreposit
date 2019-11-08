//Add address Test//
package com.Laundry.PageObjects;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Laundry.PageObjects.HomePage;
import com.Laundry.PageObjects.Laundry_Base_Class;
import com.Laundry.PageObjects.LoginPage;
import com.Laundry.PageObjects.OrdersPage;

public class AddressPage_TC1 extends Laundry_Base_Class


{
	@Test(groups = { "EditProfile" })
	public void AddressPage1() throws InterruptedException {
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
		for(int i=0;i<5;i++)
		{
			op.rightplus.click();
		}
		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver1);		
		WebDriverWait wait=new WebDriverWait(driver1,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.addaddress(address1, address2, location, City);
		System.out.println("Address added successfully");
		

	}}
	