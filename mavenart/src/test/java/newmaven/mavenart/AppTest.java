package newmaven.mavenart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class AppTest 
{
public static WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.moorthi\\Downloads\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    driver.get("http://dreamguys.co.in/demo/gigs/");
	    }
}
