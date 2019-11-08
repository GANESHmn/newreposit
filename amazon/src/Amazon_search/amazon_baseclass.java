package Amazon_search;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class amazon_baseclass {
	readconfig rc=new readconfig();

	public String Baseurl;
	public String username;
	public String password;
	public String Searchproduct = "samsung galaxy s10";
	public String pincode="641011";
	public String address1="5/54a, ";
	public String city="COIMBATORE";
	public String address2= "ganesh nagar,";
	public String state= "TAMIL NADU";
	
	
	public static WebDriver driver;
	public static WebDriver driver1;
	public static WebDriver driver2;
	public static WebDriver driver3;

	@BeforeSuite
	public void setup() 
	{
		Baseurl=rc.geturl();
		username=rc.username();
		password=rc.password();
		String path = System.getProperty("user.dir");
		System.out.println(path); 
		System.setProperty("webdriver.chrome.driver",path+"\\test-output\\chromedriver.exe");
	    
	    }
//	@AfterSuite
/*	public void endsetup()
	{
			driver.quit();
		}*/
}
