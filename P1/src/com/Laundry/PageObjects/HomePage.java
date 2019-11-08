	package com.Laundry.PageObjects;
	import java.util.concurrent.TimeUnit;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.How;
    import org.openqa.selenium.support.PageFactory;
    import org.testng.annotations.AfterMethod;

	public class HomePage extends Laundry_Base_Class{
		WebDriver ldriver;
		public HomePage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver,this);
		}
		@FindBy(how = How.LINK_TEXT, using = "Home")
		@CacheLookup
		WebElement home;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/strong")
		@CacheLookup
		WebElement alertmsg;
		
		@FindBy(id="postcode-input")
		@CacheLookup
		WebElement txtpostcode;
		
		@FindBy(how = How.XPATH, using = "/html/body/section[2]/div/div/div[1]/div/form/div[3]/a/div")
		@CacheLookup
		public
		WebElement btndryclean;
		
		@FindBy(how = How.XPATH, using = "/html/body/section[2]/div/div/div[1]/div/form/div[3]")
		@CacheLookup
		WebElement btnshirts;
		
		@FindBy(how = How.XPATH, using = "/html/body/section[2]/div/div/div[1]/div/form/div[4]/div[1]/a/div")
		@CacheLookup
		WebElement btnLaundry;
		
		@FindBy(how = How.XPATH, using = "/html/body/section[2]/div/div/div[1]/div/form/div[4]/div[2]/a/div")
		@CacheLookup
		WebElement btnIroning;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"Silk-shirt\"]")
		@CacheLookup
		WebElement btnmens;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"heading-2\"]/a/div/span[2]")
		@CacheLookup
		WebElement btnwomens;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"heading-3\"]/a/div")
		@CacheLookup
		WebElement btnkids;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"drop1\"]/i")
		@CacheLookup
		WebElement notification;	
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[2]/ul/div[2]/li[1]/div/div/div")
		@CacheLookup
		WebElement notification1;
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[2]/ul/div[2]/li[2]/div/div/div")
		@CacheLookup
		WebElement notification2;
				
	    @FindBy(how = How.XPATH, using = "//*[@id=\"drop1\"]/b")
	    @CacheLookup     //*[@id="drop1"]/b
		WebElement profile;
			
		@FindBy(how = How.LINK_TEXT, using = "My Profile")
		@CacheLookup
		WebElement myprofile;
				
	//	@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[3]/ul/li[2]/a")
		
		@FindBy(how = How.XPATH, using = "/html/body/header/div/div/div/div[2]/ul/li[3]/ul/li[2]/a")
		@CacheLookup
		WebElement logout;
		
		@FindBy(how = How.XPATH, using = "/html/body/section/div/div[2]/div[2]/div/div[1]/span/a/i")
		@CacheLookup   
		WebElement editprofile;
		
		@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[1]/h1")
		@CacheLookup                     
		WebElement errormsg;
		
		public void home(String zipcode1,WebElement btndryclean1)
		{
		home.click();
		txtpostcode.sendKeys(zipcode1);
		btndryclean.click();			
		}
		public void notification()
	    {
		notification.click();
		String message1=notification1.getText();
		System.out.println("notification messages are " +message1 );
		String message2=notification2.getText();
		System.out.println("notification messages are " +message2);
		}
	    public void eidtprofile()
	    {	    	
		profile.click();
		ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Actions act= new Actions(ldriver);
	    act.moveToElement(myprofile).click().build().perform();
	    editprofile.click();
	    }
	    }