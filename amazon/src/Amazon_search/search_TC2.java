package Amazon_search;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class search_TC2  extends amazon_baseclass{

	@Test
	public void search_product_iphone7() throws IOException, InterruptedException 
	{
		driver1=new ChromeDriver();
		driver1.get(Baseurl);
		driver1.manage().window().maximize();
		Login_page lp=new Login_page(driver1);
		lp.hellosignup();
		lp.txtusername(username);
		lp.unsubmitbtn();
		lp.setpassword(password);
		lp.pwsubmitbtn();
		search_page sp=new search_page(driver1);
		sp.searchbx("iphone7");
		 sp.searchclk();
		sp.autosuggestion();
        sp.addtocartclk();
		
	}
}
