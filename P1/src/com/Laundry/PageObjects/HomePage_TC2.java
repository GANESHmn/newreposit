//home Page test with Invalid Zipcode//

package com.Laundry.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage_TC2 extends Laundry_Base_Class

{
	@Test(groups = { "HomePage" })
	public void Homepage2() {
		
		
		driver2=new ChromeDriver();
	    driver2.get(Baseurl);
	    driver2.manage().window().maximize();
		LoginPage lp=new LoginPage(driver2);
		lp.setemail(username);
		lp.setpassword(Password);
		lp.btnclick();
		HomePage hp=new HomePage(driver2);
		hp.home(invalidZipcode,hp.btndryclean);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    String errormessage=hp.errormsg.getText();
		System.out.println(errormessage);
		}
	}