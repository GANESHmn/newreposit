//Address delete//

package com.Laundry.PageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddressPage_TC3 extends Laundry_Base_Class

{
	@Test(groups = { "EditProfile" })
	public void AddressPage3() throws InterruptedException {
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver3);
		hp.home(ValidZipcode,hp.btndryclean);
		OrdersPage op=new OrdersPage(driver3);
		for(int i=0;i<5;i++)
		{
			op.rightplus.click();
		}
		op.rightplus.click();
		op.btncontinue.click();
		op.washed.click();
		op.btncontinue_to_pay.click();
		AddressPage ap=new AddressPage(driver3);
		WebDriverWait wait=new WebDriverWait(driver3,10);
		wait.until(ExpectedConditions.visibilityOf(ap.addaddress));
		ap.deleteaddress();
		
        
	}}
	