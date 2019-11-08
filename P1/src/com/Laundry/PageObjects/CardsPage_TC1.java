//**Card Validation without Expiry date and CCV**//
package com.Laundry.PageObjects;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CardsPage_TC1 extends Laundry_Base_Class

{
	@Test(groups = { "PaymentPage" })
	public void PaymentPage3() throws InterruptedException {
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
		ap.addressbox.click();
		JavascriptExecutor js=(JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		ap.setpickupdate();
		ap.setdeliverydate();
		
		PaymentPage pp=new PaymentPage(driver1);
		JavascriptExecutor je=(JavascriptExecutor)driver1;
		je.executeScript("arguments[0].scrollIntoView(true);",pp.paybtn);
		pp.cardnumber.sendKeys(Cardnumber);
		//pp.cardexpiry.sendKeys(Cardexpiry);
		//pp.cardcvc.sendKeys(cvc);
		pp.paybtn.click();	
		WebDriverWait wait1=new WebDriverWait(driver1,10);
		wait1.until(ExpectedConditions.visibilityOf(pp.paymenterror));
		System.out.println("Error message " +pp.paymenterror.getText());		
	}}
	