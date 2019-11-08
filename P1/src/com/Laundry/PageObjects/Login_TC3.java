//Login test with Invalid email only//

package com.Laundry.PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_TC3 extends Laundry_Base_Class


{
	@Test(groups = { "Login" })
	public void login05() 
	{
		driver3=new ChromeDriver();
		driver3.get(Baseurl);
		driver3.manage().window().maximize();
		LoginPage lp=new LoginPage(driver3);
		lp.setemail(username);
		lp.btnclick();
		System.out.println("Test passed");
	}
	

}
	
	

