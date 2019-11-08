package Amazon_search;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Login_page {
	public WebDriver ldriver;
	public Login_page(WebDriver rdriver) throws IOException
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"nav-link-accountList\"]")
	//@FindBy(linkText = "Hello, Testdemo1")
	@CacheLookup
    private WebElement hellosignin;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_email\"]")
	@CacheLookup
    private WebElement username;
		
	@FindBy(how = How.XPATH, using= "//*[@id=\"continue\"]")
	@CacheLookup
    private WebElement unsubmitbtnelement;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_password\"]")
	@CacheLookup
    WebElement txtpassword;
		
	@FindBy(how = How.XPATH, using= "//*[@id=\"signInSubmit\"]")
	@CacheLookup
	WebElement pwsubmitbtnelement;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"createAccountSubmit\"]")
	@CacheLookup
	WebElement createaccount;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_customer_name\"]")
 	@CacheLookup
 	public WebElement usernametxt;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_phone_number\"]")
	@CacheLookup
	public WebElement Mobilenumbertxt;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_email\"]")
	@CacheLookup
	public WebElement Emailtxt;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_password\"]")
	@CacheLookup
	public WebElement Passwordtxt;
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"continue\"]")
	@CacheLookup
	public WebElement Continuetxt;
	
	/*@FindBy(how = How.XPATH, using= "//*[@id=\"ap_email\"]")
	@CacheLookup
    private WebElement username;*/
	
	public void hellosignup()
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(hellosignin).perform(); 
		action.moveToElement(hellosignin).click().perform(); 
	}
	
	
	public void Createaccountfn() {
		createaccount.click(); 
	}
	 
		
	public void txtusername(String phone)
	{
		username.sendKeys(phone);
	}
	public void unsubmitbtn()
	{
		unsubmitbtnelement.click();
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void pwsubmitbtn()
	{
		pwsubmitbtnelement.click();
	}
	
	 public void register(String user_name,String Mobile_number,String Email ,String Password) throws IOException
	 {    
	 ldriver.switchTo().defaultContent();
	 String parentWindow = ldriver.getWindowHandle();
	 //Set<String> handles =  ldriver.getWindowHandles();
	 ldriver.switchTo().window(parentWindow);		 
	 usernametxt.sendKeys(user_name);
	 Mobilenumbertxt.sendKeys(Mobile_number);
	 Emailtxt.sendKeys(Email);
	 Passwordtxt.sendKeys(Password);
	 WebDriverWait wait1=new WebDriverWait(ldriver,10);
	 wait1.until(ExpectedConditions.visibilityOf(Continuetxt));
	 Continuetxt.click();
	 ldriver.switchTo().defaultContent();
     }	
	 
		@Test(dataProvider = "inputdata")
		 public void registerr(String user_name,String Mobile_number,String Email ,String Password) throws IOException
		 {  
	     	System.out.print("test");
		   // Login_page lp=new Login_page(ldriver);
			register(user_name,Mobile_number,Email,Password);
			
		 }
		 	
		
	@DataProvider(name="inputdata")
		String [][] getData() throws IOException
		{
		 
			//String path=System.getProperty("user.dir")+"/Testdata.xlsx";
			String path=System.getProperty("C:\\Users\\Dreamsuser\\Sathya\\amazon\\test-output");	
			
			int rowcount=Read_Excel.getRowCount(path,"Sheet1");
			System.out.print("rowcount"+rowcount);
			int colcount=Read_Excel.getCellcount(path,"Sheet1",rowcount);
			System.out.print("colcount"+colcount);
			String inputdata[][]=new String [rowcount][colcount];
			for(int i=1;i<=rowcount;i++)
			{
		
				for(int j=0;j<colcount;j++)
				{
					inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
				}
		    }
			
		return inputdata;
	   } 
}
