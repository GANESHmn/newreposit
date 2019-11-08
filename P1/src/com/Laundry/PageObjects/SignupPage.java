package com.Laundry.PageObjects;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class SignupPage {

		WebDriver ldriver;
		
		SignupPage(WebDriver rdriver)
		
		{
			
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(id="name")
		@CacheLookup
		WebElement txtname;
		@FindBy(id="email")
		@CacheLookup
		WebElement txtemail;
		@FindBy(id="password")
		@CacheLookup
		WebElement txtpassword1;
		@FindBy(id="password_confirmation")
		@CacheLookup
		WebElement txtpasswordconf;
		@FindBy(id="mobile_number")
		@CacheLookup
		WebElement txtmobile;
		@FindBy(id="terms_and_condition_accept")
		@CacheLookup
		WebElement chkboxterms;
		@FindBy(id="submit_btn")
		@CacheLookup
		WebElement btnsubmit;
		@FindBy(how = How.LINK_TEXT, using = "Create a new account")
		@CacheLookup
		WebElement linkcreatenew;
		@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[6]/a")
		@CacheLookup
		WebElement Ordernow;
		@FindBy(how = How.XPATH, using = "//*[@id=\"name-error\"]")
		@CacheLookup
		WebElement Name_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"email-error\"]")
		@CacheLookup
		WebElement Email_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password-error\"]")
		@CacheLookup
		WebElement Password_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password_confirmation-error\"]")
		@CacheLookup
		WebElement Password_Confirm_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"mobile-error\"]")
		@CacheLookup
		WebElement Mobile_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"terms_and_condition_accept-error\"]")
		@CacheLookup
		WebElement Terms_error;
		@FindBy(how = How.XPATH, using = "//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[i]")
		@CacheLookup
		WebElement OTP;
		@FindBy(how = How.XPATH, using = "//*[@id=\"verify_otp_btn\"]")
		@CacheLookup
		WebElement Verifybtn;
		@FindBy(how = How.XPATH, using = "//*[@id=\"verify_cancel_btn\"]")
		@CacheLookup
		WebElement Cancelbtn;
		@FindBy(how = How.XPATH, using = "//*[@id=\"resend_otp_btn\"]")
		@CacheLookup
		WebElement ResendOtpbtn;
		@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[7]/a")
		@CacheLookup
		WebElement Alreadyauserlogin;
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div/div/div/div[2]/a")
		@CacheLookup
		WebElement CreateaNewAccount;
		//@FindBy(how = How.XPATH, using = "/html/body/div[1]")
		@FindBy(how = How.XPATH, using = "/html/body/div[1]")
		@CacheLookup
		public WebElement AlertDuplicateAccount;

		public void ordernow()
		
		{
			Ordernow.click();
		}
		
       public void alreadyuserlogin()
	    {
    	   Alreadyauserlogin.click();
    	   
		}
		public void createnew()
		{
			WebDriverWait wait=new WebDriverWait(ldriver,15);
			wait.until(ExpectedConditions.visibilityOf(CreateaNewAccount));
			CreateaNewAccount.click();
			/*linkcreatenew.click();*/
		}
		public void setname(String name)
		{
			txtname.sendKeys(name);
		
		}
		public void setemail1(String email)
		{
			txtemail.sendKeys(email);
		}
		public void setpassword1(String pwd1)
		{
			txtpassword1.sendKeys(pwd1);
		}
		public void setconfpwd(String pwd1)
		{
			txtpasswordconf.sendKeys(pwd1);
		}
		public void setmobile(String mobile)
		{
			txtmobile.sendKeys(mobile);
		}
		public void termsandcond()
		{
			chkboxterms.click();
		}
		public void btnclick()
		{
			btnsubmit.click();
	}
		
	public void setOtp(String[] otp)
	{
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[1]")).sendKeys(otp[0]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[2]")).sendKeys(otp[1]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[3]")).sendKeys(otp[2]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[4]")).sendKeys(otp[3]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[5]")).sendKeys(otp[4]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[6]")).sendKeys(otp[5]);
			Verifybtn.click();
	}
	public void setOtp1(String[] otp)
	{
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[1]")).sendKeys(otp[0]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[2]")).sendKeys(otp[1]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[3]")).sendKeys(otp[2]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[4]")).sendKeys(otp[3]);
			ldriver.findElement(By.xpath("//*[@id=\"mob_verification_modal\"]/div/div/div[2]/div[1]/div/input[5]")).sendKeys(otp[4]);
			
			Verifybtn.click();
	}
	public void Duplicatealert()
	{
		 WebElement element = ldriver.findElement(By.xpath("/html/body/div[1]"));
		 ((JavascriptExecutor) ldriver).executeScript("arguments[0].click()", element);
		 
		 Alert promptAlert  = ldriver.switchTo().alert();
		 String alertText = promptAlert .getText();
		 System.out.println("Alert text is " + alertText);
		
		
		Actions builder=new Actions(ldriver);
		builder.moveToElement(AlertDuplicateAccount).perform();
		builder.moveToElement(AlertDuplicateAccount).clickAndHold();
		
		Alert alert = ldriver.switchTo().alert();	
		System.out.println("Tooltip/ Help message is "+alert.getText());
		System.out.print(AlertDuplicateAccount.getText());
		
	}
	
	
	}
		