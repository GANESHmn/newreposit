//Edit Address//

package com.Laundry.PageObjects;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Laundry.PageObjects.AddressPage;
import com.Laundry.PageObjects.HomePage;
import com.Laundry.PageObjects.Laundry_Base_Class;
import com.Laundry.PageObjects.LoginPage;
import com.Laundry.PageObjects.OrdersPage;

public class AddressPage_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void AddressPage2() throws InterruptedException {
		driver2=new ChromeDriver();
		driver2.get(Baseurl);
		driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver2);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver2);
		for(int i=0;i<5;i++)
		{
			op.rightplus.click();
		}
		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver2);
		
		ap.editaddress();
		System.out.println("Address edited successfully");

	}}
	