//**Payment test without mandatory fields**//

package com.Laundry.PageObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PaymentPage_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "PaymentPage" })
	public void PaymentPage2() {
	
		driver.get(Baseurl);
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver);
		for(int i=1;i<4;i++)
		{
			op.rightplus.click();
		}
		
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.addressbox.click();
		
		PaymentPage pp=new PaymentPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor je1=(JavascriptExecutor)driver;
		je1.executeScript("arguments[0].scrollIntoView(true);",pp.paybtn);
		pp.paybtn.click();
		
		if(ap.pickupdate.isDisplayed()==true)
		{
			System.out.println("Pickupdate and delivery dates are mandatory");
		}
		
	}}
	