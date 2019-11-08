//Login test with Invalid email and password //

package com.Laundry.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_TC4 extends Laundry_Base_Class


{
	@Test(groups = { "Login" })
	public void login04() {
		driver4=new ChromeDriver();
		driver4.get(Baseurl);
		driver4.manage().window().maximize();
		driver4.get(Baseurl);
		driver4.manage().window().maximize();
		LoginPage lp=new LoginPage(driver4);
		lp.setemail(Email);
		lp.setpassword(invalidpwd);
		
		lp.btnclick();
		
	
		
			
				
		String acttext=driver.findElement(By.xpath("/html/body/div[1]/strong")).getText();	
			String exptext="These credentials do not match our records.";
			System.out.println(acttext);
if(acttext.equals(exptext))
	{
		System.out.println("Test passed");
	}
		else {
			System.out.println("Test failed");	
	}}
	
	

}