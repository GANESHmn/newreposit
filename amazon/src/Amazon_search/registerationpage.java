package Amazon_search;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class registerationpage extends amazon_baseclass{
WebDriver ldriver;
 

	public registerationpage() throws IOException
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"nav-link-accountList\"]")
	@CacheLookup
    private WebElement hellosignin;
		
	@FindBy(how = How.XPATH, using= "//*[@id=\"createAccountSubmit\"]")
	@CacheLookup
    private WebElement createaccount;
	
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
	
	@FindBy(how = How.XPATH, using= "//*[@id=\"ap_email\"]")
	@CacheLookup
    private WebElement username;
	public String localtext="test";
	
	@Test
	public void hellosignup()
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(hellosignin).perform(); 
		action.moveToElement(hellosignin).click().perform(); 
	}
	@Test
	public void Createaccountfn() {
		createaccount.click(); 
	}
	 
	 
	/* public void login(String env)
	 {
	 	txtusername.sendKeys(username);
	 	txtpassword.sendKeys(Password);
	 	loginbtn.click();
	 	
	 }*/
	@Test(dataProvider = "inputdata")
	 public void register(String user_name,String Mobile_number,String Email ,String Password) throws IOException
	 {    
	 	 usernametxt.sendKeys(user_name);
		 Mobilenumbertxt.sendKeys(Mobile_number);
		 Emailtxt.sendKeys(Email);
		 Passwordtxt.sendKeys(Password);
		 WebDriverWait wait1=new WebDriverWait(driver,10);
		 wait1.until(ExpectedConditions.visibilityOf(Continuetxt));
		 Continuetxt.click();
		 driver.switchTo().defaultContent();
	 }	
	 

		

	/*		@Test(dataProvider = "inputdata")
		public void registration(String user_name,String Mobile_number,String Email ,String Password) throws IOException, InterruptedException
		{
			driver1=new ChromeDriver();
			driver1.get(Baseurl);
			driver1.manage().window().maximize();		
			registerationpage rp=new registerationpage();
			rp.hellosignup();
			rp.Createaccountfn();
			rp.register(user_name,Mobile_number,Email,Password);
		}*/
		

	@DataProvider(name="inputdata")
		String [][] getData() throws IOException
		{
		 
			String path=System.getProperty("user.dir")+"/Testdata.xlsx";
			
			int rowcount=Read_Excel.getRowCount(path,"Sheet1");
			int colcount=Read_Excel.getCellcount(path,"Sheet1",rowcount);
			
			String inputdata[][]=new String [rowcount][colcount];
			for(int i=1;i<=rowcount;i++){
		
				for(int j=0;j<colcount;j++)
				{
					inputdata[i-1][j]=Read_Excel.getCelldata(path,"Sheet1",i,j);
				}}
			
		return inputdata;
	}
}
